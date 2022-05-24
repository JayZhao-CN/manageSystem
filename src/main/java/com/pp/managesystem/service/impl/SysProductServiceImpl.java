package com.pp.managesystem.service.impl;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.pp.managesystem.dao.SysProductBreakMapper;
import com.pp.managesystem.dao.SysProductMapper;
import com.pp.managesystem.dao.SysTypeMapper;
import com.pp.managesystem.entity.*;
import com.pp.managesystem.service.SysProductBreakService;
import com.pp.managesystem.service.SysProductDetailService;
import com.pp.managesystem.service.SysProductProcessDetailService;
import com.pp.managesystem.service.SysProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jay
 * @since 2022-05-16
 */
@Service
@Slf4j
public class SysProductServiceImpl extends ServiceImpl<SysProductMapper, SysProduct> implements SysProductService {

    @Resource
    SysProductMapper sysProductMapper;
    @Resource
    SysTypeMapper sysTypeMapper;
    @Resource
    SysProductBreakMapper sysProductBreakMapper;
    @Resource
    SysProductBreakService sysProductBreakService;
    @Resource
    SysProductDetailService sysProductDetailService;
    @Resource
    SysProductProcessDetailService sysProductProcessDetailService;

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
    public List<SysProduct> selectByTypeAndBatchAndCompany(String typeCode, int batch, String company) {
        QueryWrapper<SysProduct> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("pr_type_code",typeCode)
                .eq("pr_batch",batch)
                .eq("pr_company",company);

        List<SysProduct> sysProducts = sysProductMapper.selectList(queryWrapper);

        return sysProducts;
    }

    @Override
    public Map selectMaxByTypeAndCompany(String typeCode,  String company) {
        Map map = sysProductMapper.selectMaxByTypeAndBatchAndCompany(typeCode, company);
        return map;
    }

    @Override
    @Transactional
    public int addProduct(SysProduct sysProduct) {
        // 添加product表数据（以批次分）插入一条数据
        sysProduct.setPrCount(sysProduct.getPrPerCount() * sysProduct.getPrUnitCount()); // 80
        sysProduct.setPrCode(sysProduct.getPrCompany()+ IdUtil.fastUUID() + sysProduct.getPrBatch() + sysProduct.getPrCount());
        sysProduct.setPrTime(new Date());
        sysProductMapper.insert(sysProduct);

        // 添加break表数据（以传入的break分）插入四条数据
        int perCount = sysProduct.getPrCount()/sysProduct.getBreakCount(); // 80/4 = 20

        List<SysProductDetail> sysProductDetails = new ArrayList<>();
        List<SysProductProcessDetail> sysProductProcessDetails = new ArrayList<>();
        List<SysProductBreak> sysProductBreaks = new ArrayList<>();

        for (int i = 0;i < sysProduct.getBreakCount();i++){ // sysProduct.getBreakCount() = 4
            // 份数数据
            SysProductBreak sysProductBreak = new SysProductBreak();
            sysProductBreak.setPrCode(sysProduct.getPrCode());
            sysProductBreak.setPrBreakCode(sysProduct.getPrCode()+ (i+1));
            sysProductBreak.setCount(perCount);
            sysProductBreak.setIsChoose("0");
            sysProductBreaks.add(sysProductBreak);

            for (int j = 0;j < perCount;j++){ // perCount = 20
                // product detail数据
                SysProductDetail sysProductDetail = new SysProductDetail();
                sysProductDetail.setPrCode(sysProduct.getPrCode());
                sysProductDetail.setPrBreakCode(sysProduct.getPrCode()+ (i+1) + (j+1));
                sysProductDetails.add(sysProductDetail);

                // process detail数据
                SysProductProcessDetail sysProductProcessDetail = new SysProductProcessDetail();
                sysProductProcessDetail.setPrCode(sysProduct.getPrCode());
                sysProductProcessDetail.setPrBreakCode(sysProduct.getPrCode()+ (i+1) + (j+1));
                sysProductProcessDetails.add(sysProductProcessDetail);
            }
        }

        // 添加break表数据（以传入的break分）插入四条数据
        sysProductBreakService.saveBatch(sysProductBreaks,sysProduct.getBreakCount());

        // 添加detail表数据（以break的count添加）插入大概80条数据
        sysProductDetailService.saveBatch(sysProductDetails,sysProduct.getBreakCount() * perCount);
        sysProductProcessDetailService.saveBatch(sysProductProcessDetails,sysProduct.getBreakCount() * perCount);
        return 0;
    }

    @Override
    public List<SysProductBreak> getBreakProductsByPrCode(String prCode) {
        QueryWrapper<SysProductBreak> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pr_code",prCode);
        List<SysProductBreak> sysProductBreaks = sysProductBreakService.getBaseMapper().selectList(queryWrapper);
        sysProductBreaks.forEach(sysProductBreak -> {
            String prCode1 = sysProductBreak.getPrCode();
            String prBreakCode = sysProductBreak.getPrBreakCode();
            String replace = prBreakCode.substring(prCode1.length());
            sysProductBreak.setPrBreakCodeSim(replace);
            log.info(replace);
        });
        return sysProductBreaks;
    }
}
