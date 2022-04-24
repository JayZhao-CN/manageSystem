package com.pp.managesystem.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.service.SysExtProptiesService;
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
 * @since 2022-04-24
 */
@RestController
@RequestMapping("/sys_ext_propties")
@Slf4j
public class SysExtProptiesController {

    @Autowired
    SysExtProptiesService sysExtProptiesService;

    /**
     * 获取扩展属性列表
     * @return SysMsg
     */
    @GetMapping("/detail/{proptiesType}")
    public SysMsg getAllStyles(@RequestParam(value = "pageNum")Integer pageNum,
                               @RequestParam(value = "pageSize")Integer pageSize,
                               @RequestParam("company")String company,
                               @PathVariable("proptiesType")String proptiesType){
        try {
            log.info("获取扩展属性列表{}",proptiesType);
            PageHelper.startPage(pageNum,pageSize);
            List<Map> result = sysExtProptiesService.getByCompanyAndType(company, proptiesType);
            PageInfo<Map> pageInfo = new PageInfo<>(result);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }
}

