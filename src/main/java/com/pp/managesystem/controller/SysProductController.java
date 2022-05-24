package com.pp.managesystem.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysProduct;
import com.pp.managesystem.entity.SysProductBreak;
import com.pp.managesystem.service.SysProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jay
 * @since 2022-05-16
 */
@RestController
@RequestMapping("/sys_product")
@Slf4j
public class SysProductController {

    @Autowired
    SysProductService sysProductService;

    /**
     * 获取所有批次产品
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllProducts(@RequestParam(value = "pageNum")Integer pageNum,
                               @RequestParam(value = "pageSize")Integer pageSize,
                               @RequestParam("company")String company){
        try {
            log.info("{}尝试获取所有批次信息",company);
            PageHelper.startPage(pageNum,pageSize);
            List<SysProduct> sysProducts = sysProductService.getByCompany(company, pageNum, pageSize);
            PageInfo<SysProduct> pageInfo = new PageInfo<>(sysProducts);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加批次
     * @return SysMsg
     */
    @PostMapping("/add")
    public SysMsg addBatch(SysProduct sysProduct) {
        try {
            // 校验产品批次是否存在
            List<SysProduct> sysProducts = sysProductService.selectByTypeAndBatchAndCompany(sysProduct.getPrTypeCode(), sysProduct.getPrBatch(), sysProduct.getPrCompany());
            if (sysProducts.size() > 0) {
                Map map = sysProductService.selectMaxByTypeAndCompany(sysProduct.getPrTypeCode(), sysProduct.getPrCompany());
                int maxBatch = (int) map.get("maxBatch");
                return SysMsg.failed().add("msg","该产品类型的 "+sysProducts.get(0).getPrBatch()+"批（刀） 已存在！当前最新批次为：" + maxBatch);
            }

            log.info("尝试添加批次："+sysProduct);
            return SysMsg.success().add("state",sysProductService.addProduct(sysProduct));
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }


    /**
     * 获取批次所有份数
     * @return SysMsg
     */
    @GetMapping("/break/detail")
    public SysMsg getAllBreakProducts(@RequestParam(value = "pageNum")Integer pageNum,
                                 @RequestParam(value = "pageSize")Integer pageSize,
                                 @RequestParam("prCode")String prCode){
        try {
            log.info("{}尝试获取批次所有份数",prCode);
            PageHelper.startPage(pageNum,pageSize);
            List<SysProductBreak> breakProducts = sysProductService.getBreakProductsByPrCode(prCode);
            PageInfo<SysProductBreak> pageInfo = new PageInfo<>(breakProducts);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }
}

