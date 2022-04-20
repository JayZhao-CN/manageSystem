package com.pp.managesystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.pp.managesystem.dao.SysProductProcessMapper;
import com.pp.managesystem.dao.SysTypeMapper;
import com.pp.managesystem.entity.SysProductProcess;
import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.service.SysProductProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
 * @since 2022-04-20
 */
@Service
public class SysProductProcessServiceImpl extends ServiceImpl<SysProductProcessMapper, SysProductProcess> implements SysProductProcessService {

    @Autowired
    SysTypeMapper sysTypeMapper;

    @Autowired
    SysProductProcessMapper sysProductProcessMapper;

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

            // 根据type_code获取工序配置情况
            String typeCode = sysType.gettCode();
            // 类型名称
            String typeName = sysType.gettName();

            List<Map> processByTypeCode = sysProductProcessMapper.getProcessByTypeCode(typeCode);
            StringBuilder processCodes = new StringBuilder();
            StringBuilder processNames = new StringBuilder();
            if (processByTypeCode != null && processByTypeCode.size()>0){
                processByTypeCode.forEach(typeProcess ->{
                    String processCode = typeProcess.get("processCode").toString();
                    String  processName = typeProcess.get("processName").toString();
                    processCodes.append("/").append(processCode).append("/");
                    if (processNames.length() == 0){
                        // 第一个数据
                        processNames.append(processName);
                    }else {
                        // 非第一个数据
                        processNames.append("，").append(processName);
                    }
                });

                // 该type相关数据处理完毕，进行保存
                typeInfoMap.put("typeCode",typeCode);
                typeInfoMap.put("typeName",typeName);
                typeInfoMap.put("processCodes",processCodes.toString());
                typeInfoMap.put("processNames",processNames.toString());

                // 清除临时缓存容器
                processCodes.setLength(0);
                processNames.setLength(0);
            }else {
                // 未配置工序
                // 该type相关数据处理完毕，进行保存
                typeInfoMap.put("typeCode",typeCode);
                typeInfoMap.put("typeName",typeName);
                typeInfoMap.put("processCodes",null);
                typeInfoMap.put("processNames",null);
            }

                // 将该type存入返回容器
                resultList.add(typeInfoMap);
        });

        return resultList;
    }
}
