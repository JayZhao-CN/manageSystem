package com.pp.managesystem.service.impl;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.pp.managesystem.dao.SysProductMapper;
import com.pp.managesystem.dao.SysTypeMapper;
import com.pp.managesystem.entity.SysProduct;
import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.service.SysProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jay
 * @since 2022-05-16
 */
@Service
public class SysProductServiceImpl extends ServiceImpl<SysProductMapper, SysProduct> implements SysProductService {

    @Resource
    SysProductMapper sysProductMapper;
    @Resource
    SysTypeMapper sysTypeMapper;

    @Override
    public List<SysProduct> getByCompany(String company,int pageNum,int pageSize) {
        QueryWrapper<SysProduct> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pr_company",company);
        PageHelper.startPage(pageNum,pageSize);
        List<SysProduct> sysProducts = sysProductMapper.selectList(queryWrapper);

        sysProducts.forEach(sysProduct -> {
            // pr_type_code -> pr_type_code_name
            SysType sysType = sysTypeMapper.selectByCode(sysProduct.getPrTypeCode());
            sysProduct.setPrTypeCodeName(sysType.gettName());
            // pr_time -> pr_time_format
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            sysProduct.setPrTimeFormat(simpleDateFormat.format(sysProduct.getPrTime()));
        });

        return sysProducts;
    }

    @Override
    public List<SysProduct> selectByTypeAndBatchAndCompany(String typeCode, String batch, String company) {
        QueryWrapper<SysProduct> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("pr_type_code",typeCode)
                .eq("pr_batch",batch)
                .eq("pr_company",company);

        List<SysProduct> sysProducts = sysProductMapper.selectList(queryWrapper);

        return sysProducts;
    }

    @Override
    public int addProduct(SysProduct sysProduct) {
        sysProduct.setPrCount(sysProduct.getPrPerCount() * sysProduct.getPrUnitCount());
        sysProduct.setPrCode(sysProduct.getPrCompany()+ IdUtil.fastUUID() + sysProduct.getPrBatch() + sysProduct.getPrCount());
        sysProduct.setPrTime(new Date());
        return sysProductMapper.insert(sysProduct);
    }
}
