package com.pp.managesystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.pp.managesystem.dao.SysProductProptiesMapper;
import com.pp.managesystem.dao.SysTypeMapper;
import com.pp.managesystem.entity.SysProductPropties;
import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.service.SysProductProptiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jay
 * @since 2022-04-21
 */
@Service
public class SysProductProptiesServiceImpl extends ServiceImpl<SysProductProptiesMapper, SysProductPropties> implements SysProductProptiesService {

    @Autowired
    SysTypeMapper sysTypeMapper;

    @Autowired
    SysProductProptiesMapper sysProductProptiesMapper;

    @Override
    public List<Map> getDetail(int pageNum, int pageSize, String company) {

        // 返回list
        List<Map> resultList = new ArrayList<>();

        // 先查询该公司的type
        PageHelper.startPage(pageNum,pageSize);
        List<SysType> sysTypes = sysTypeMapper.selectByCompany(company);

        // 循环获取type
        sysTypes.forEach(sysType -> {
            // 保存该type的相关数据
            Map typeInfoMap = new HashMap();

            // 根据type_code获取属性配置情况
            String typeCode = sysType.gettCode();
            // 类型名称
            String typeName = sysType.gettName();

            List<Map> proptiesByTypeCode = sysProductProptiesMapper.getProptiesByTypeCode(typeCode);
            StringBuilder proptiesCodes = new StringBuilder();
            StringBuilder proptiesNames = new StringBuilder();
            if (proptiesByTypeCode != null && proptiesByTypeCode.size()>0){
                proptiesByTypeCode.forEach(typepropties ->{
                    String proptiesCode = typepropties.get("proptiesCode").toString();
                    String  proptiesName = typepropties.get("proptiesName").toString();
                    proptiesCodes.append("/").append(proptiesCode).append("/");
                    if (proptiesNames.length() == 0){
                        // 第一个数据
                        proptiesNames.append(proptiesName);
                    }else {
                        // 非第一个数据
                        proptiesNames.append("，").append(proptiesName);
                    }
                });

                // 该type相关数据处理完毕，进行保存
                typeInfoMap.put("typeCode",typeCode);
                typeInfoMap.put("typeName",typeName);
                typeInfoMap.put("proptiesCodes",proptiesCodes.toString());
                typeInfoMap.put("proptiesNames",proptiesNames.toString());

                // 清除临时缓存容器
                proptiesCodes.setLength(0);
                proptiesNames.setLength(0);
            }else {
                // 未配置工序
                // 该type相关数据处理完毕，进行保存
                typeInfoMap.put("typeCode",typeCode);
                typeInfoMap.put("typeName",typeName);
                typeInfoMap.put("proptiesCodes",null);
                typeInfoMap.put("proptiesNames",null);
            }

            // 将该type存入返回容器
            resultList.add(typeInfoMap);
        });

        return resultList;
    }

    @Override
    @Transactional
    public int updateProductPropties(SysProductPropties sysProductPropties, String company) {

        int result = 0;

        String typeCode = sysProductPropties.getProductTypeCode().toString();// 这是产品类型type code
        List<String> proptiesCodes = sysProductPropties.getProptiesCodes(); // 这是前端传来的工序propties code

        // 先把之前配置过的数据全清除
        QueryWrapper<SysProductPropties> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("product_type_code",typeCode);
        sysProductProptiesMapper.delete(queryWrapper);

        // 逐个写入新的配置
        try {
            if (proptiesCodes != null && proptiesCodes.size() > 0) {
                proptiesCodes.forEach(proptiesCode -> {
                    SysProductPropties sp2 = new SysProductPropties();
                    sp2.setProductTypeCode(Integer.parseInt(typeCode));
                    sp2.setProptiesCode(proptiesCode);
                    sysProductProptiesMapper.insert(sp2);
                });
            }
            result = 1;
        }catch(Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
