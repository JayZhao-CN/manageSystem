package com.pp.managesystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pp.managesystem.entity.SysProduct;
import com.pp.managesystem.entity.SysProductBreak;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jay
 * @since 2022-05-16
 */
public interface SysProductService extends IService<SysProduct> {

    /**
     * 根据公司编号获取产品信息
     * @param company
     * @return
     */
    List<SysProduct> getByCompany(String company,int pageNum,int pageSize);

    /**
     * 根据种类编号、批次、公司查询产品唯一性
     * @param typeCode
     * @param batch
     * @param company
     * @return
     */
    List<SysProduct> selectByTypeAndBatchAndCompany(String typeCode,int batch,String company);

    /**
     * 根据上字段查询当前最大批次
     * @param typeCode
     * @param company
     * @return
     */
    Map selectMaxByTypeAndCompany(String typeCode,String company);

    /**
     * 添加产品
     * @param sysProduct
     * @return
     */
    int addProduct(SysProduct sysProduct);

    /**
     * 查询产品编号下批次份数信息
     * @param prCode
     * @return
     */
    List<SysProductBreak> getBreakProductsByPrCode(String prCode);
}
