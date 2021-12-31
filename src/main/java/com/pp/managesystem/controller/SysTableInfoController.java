package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.service.SysTableInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tableInfo")
public class SysTableInfoController {

    @Autowired
    SysTableInfoService sysTableInfoService;

    @GetMapping
    public SysMsg getTableInfo(){
        return SysMsg.success().add("list",sysTableInfoService.getAllTableInfos());
    }
}
