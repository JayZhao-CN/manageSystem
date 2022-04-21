package com.pp.managesystem.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysPropties;
import com.pp.managesystem.service.SysProptiesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public SysMsg getAllProcesses(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                  @RequestParam(value = "pageSize",defaultValue = "15")Integer pageSize,
                                  @RequestParam("company")String company){
        try {
            log.info("尝试获取所有工序");
            PageHelper.startPage(pageNum,pageSize);
            List<SysPropties> allProptieses = sysProptiesService.getByCompany(company);
            PageInfo<SysPropties> pageInfo = new PageInfo<>(allProptieses);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }
}

