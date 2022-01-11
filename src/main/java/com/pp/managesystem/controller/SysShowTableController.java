package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.service.SyShowTableService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/table")
public class SysShowTableController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SyShowTableService syShowTableService;

    @GetMapping("/{tid}")
    public SysMsg getListByTableId(@PathVariable("tid") int id){

        try {
            return SysMsg.success().add("list", syShowTableService.selectShowTableByTableId(id));
        }catch (Exception e){
            return SysMsg.failed().add("exception",e);
        }
    }

    @GetMapping("/by/{table}")
    public SysMsg getNameByTable(@PathVariable("table")String table){
        try {
            return SysMsg.success().add("list", syShowTableService.selectByTable(table));
        }catch (Exception e){
            return SysMsg.failed().add("exception",e);
        }
    }
}
