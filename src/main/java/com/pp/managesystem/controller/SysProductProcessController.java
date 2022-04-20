package com.pp.managesystem.controller;

import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.service.SysProductProcessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sys_product_process")
@Slf4j
public class SysProductProcessController {

    @Autowired
    SysProductProcessService sysProductProcessService;

    @GetMapping("/detail")
    public SysMsg getAllColors(@RequestParam(value = "pageNum")Integer pageNum,
                               @RequestParam(value = "pageSize")Integer pageSize,
                               @RequestParam("company")String company){
        try {
            log.info("{}",company);
            List<Map> detail = sysProductProcessService.getDetail(pageNum, pageSize, company);
            PageInfo pageInfo = new PageInfo<>(detail);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }
}
