package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysProduct;
import com.pp.managesystem.service.SysProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sys_product")
public class SysProductController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysProductService sysProductService;

    /**
     * 获取所有产品
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllProducts(){
        try {
            logger.info("尝试获取所有产品");
            return SysMsg.success().add("products",sysProductService.getAllProducts());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定产品
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{pid}")
    public SysMsg getProduct(@PathVariable("pid")int id){
        try {
            logger.info("尝试获取产品："+id);
            return SysMsg.success().add("product",sysProductService.getProduct(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加产品
     * @param sysProduct
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addProduct(@RequestBody SysProduct sysProduct) {
        try {
            logger.info("尝试添加尺寸："+sysProduct);
            return SysMsg.success().add("state",sysProductService.addProduct(sysProduct));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改产品
     * @param sysProduct
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateProduct(@RequestBody SysProduct sysProduct) {
        try {
            logger.info("尝试修改产品："+sysProduct);
            return SysMsg.success().add("state",sysProductService.updateProduct(sysProduct));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除产品
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{pid}")
    public SysMsg deleteProduct(@PathVariable("pid") int id) {
        try {
            logger.info("尝试删除产品："+id);
            return SysMsg.success().add("state",sysProductService.deleteProduct(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
