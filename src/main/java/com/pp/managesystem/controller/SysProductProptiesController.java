package com.pp.managesystem.controller;


import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysProductPropties;
import com.pp.managesystem.service.SysProductProptiesService;
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
 * @since 2022-04-21
 */
@RestController
@RequestMapping("/sys_product_propties")
@Slf4j
public class SysProductProptiesController {

    @Autowired
    SysProductProptiesService sysProductProptiesService;

    @GetMapping("/detail")
    public SysMsg getAllColors(@RequestParam(value = "pageNum")Integer pageNum,
                               @RequestParam(value = "pageSize")Integer pageSize,
                               @RequestParam("company")String company){
        try {
            log.info("{}",company);
            List<Map> detail = sysProductProptiesService.getDetail(pageNum, pageSize, company);
            PageInfo pageInfo = new PageInfo<>(detail);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改
     * @param sysProductPropties
     * @return SysMsg
     */
    @PostMapping("/change")
    public SysMsg updateProcess(SysProductPropties sysProductPropties, @RequestParam("company")String company) {
        try {
            log.info("尝试修改属性{}",sysProductPropties);
            int result = sysProductProptiesService.updateProductPropties(sysProductPropties, company);
            return SysMsg.success().add("state",result);
        }catch (Exception e){
            return SysMsg.failed();
        }
    }
}

