package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysCompany;
import com.pp.managesystem.service.SysCompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("company")
public class SysCompanyController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysCompanyService sysCompanyService;

    /**
     * 获取所有公司
     * @return SysMsg
     */
    @GetMapping
    public SysMsg getAllCompanys(){
        try {
            logger.info("尝试获取所有公司");
            return SysMsg.success().add("companys",sysCompanyService.getAllCompanys());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定公司
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{cid}")
    public SysMsg getCompany(@PathVariable("cid")int id){
        try {
            logger.info("尝试获取公司："+id);
            return SysMsg.success().add("company",sysCompanyService.getCompany(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加公司
     * @param sysCompany
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addCompany(@RequestBody SysCompany sysCompany) {
        try {
            logger.info("尝试添加公司："+sysCompany);
            return SysMsg.success().add("state",sysCompanyService.addCompany(sysCompany));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改公司
     * @param sysCompany
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateCompany(@RequestBody SysCompany sysCompany) {
        try {
            logger.info("尝试修改公司："+sysCompany);
            return SysMsg.success().add("state",sysCompanyService.updateCompany(sysCompany));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除公司
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{cid}")
    public SysMsg deleteCompany(@PathVariable("cid") int id) {
        try {
            logger.info("尝试删除公司："+id);
            return SysMsg.success().add("state",sysCompanyService.deleteCompany(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
