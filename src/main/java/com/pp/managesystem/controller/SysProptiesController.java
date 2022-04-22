package com.pp.managesystem.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysPropties;
import com.pp.managesystem.service.SysProptiesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jay
 * @since 2022-04-21
 */
@RestController
@RequestMapping("/sys_propties")
@Slf4j
public class SysProptiesController {

    @Autowired
    SysProptiesService sysProptiesService;

    /**
     * 获取所有
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllProptieses(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                  @RequestParam(value = "pageSize",defaultValue = "15")Integer pageSize,
                                  @RequestParam("company")String company,
                                   @RequestParam(value = "isAll",defaultValue = "false")String isAll){
        try {
            log.info("尝试获取所有自定义属性");
            PageHelper.startPage(pageNum,pageSize);
            List<SysPropties> allProptieses = sysProptiesService.getByCompany(company,Boolean.valueOf(isAll));
            PageInfo<SysPropties> pageInfo = new PageInfo<>(allProptieses);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加
     * @param sysPropties
     * @return SysMsg
     */
    @PostMapping("/add")
    public SysMsg addPropties(SysPropties sysPropties) {

        try {
            // 校验是否存在
            SysPropties sysPropties1 = sysProptiesService.selectByNameAndCompany(sysPropties.getProptiesName(), sysPropties.getProptiesCompanyCode());
            if (null != sysPropties1) {
                return SysMsg.failed().add("msg",sysPropties1.getProptiesName()+" 已存在！编号为：" + sysPropties1.getProptiesCode());
            }

            log.info("尝试添加："+sysPropties);
            return SysMsg.success().add("state",sysProptiesService.addPropties(sysPropties));
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除
     * @param id
     * @return SysMsg
     */
    @GetMapping("/delete")
    public SysMsg deletePropties(@RequestParam("id")int id,@RequestParam("company")String company) {
        try {
            log.info("尝试删除："+id);
            return SysMsg.success().add("state",sysProptiesService.deletePropties(id,company));
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }
}

