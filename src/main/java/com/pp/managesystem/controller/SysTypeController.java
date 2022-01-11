package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.service.SysTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sys_type")
public class SysTypeController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysTypeService sysTypeService;

    /**
     * 获取所有类型
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllTypes(){

        try {
            logger.info("尝试获取所有类型");
            return SysMsg.success().add("types",sysTypeService.getAllTypes());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定类型
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{tid}")
    public SysMsg getType(@PathVariable("tid")int id){

        try {
            logger.info("尝试获取类型："+id);
            return SysMsg.success().add("type",sysTypeService.getType(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加类型
     * @param sysType
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addType(@RequestBody SysType sysType) {
        try {
            logger.info("尝试添加类型："+sysType);
            return SysMsg.success().add("state",sysTypeService.addType(sysType));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改类型
     * @param sysType
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateType(@RequestBody SysType sysType) {
        try {
            logger.info("尝试修改类型："+sysType);
            return SysMsg.success().add("state",sysTypeService.updateType(sysType));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除类型
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{tid}")
    public SysMsg deleteType(@PathVariable("tid") int id) {
        try {
            logger.info("尝试删除类型："+id);
            return SysMsg.success().add("state",sysTypeService.deleteType(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
