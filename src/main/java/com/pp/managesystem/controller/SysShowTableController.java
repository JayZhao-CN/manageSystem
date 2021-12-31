package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.service.SyShowTableService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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
}
