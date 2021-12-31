package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysStyle;
import com.pp.managesystem.service.SysStyleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("style")
public class SysStyleController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysStyleService sysStyleService;

    /**
     * 获取所有样式
     * @return SysMsg
     */
    @GetMapping
    public SysMsg getAllStyles(){
        try {
            logger.info("尝试获取所有样式");
            return SysMsg.success().add("styles",sysStyleService.getAllStyles());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定样式
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{sid}")
    public SysMsg getStyle(@PathVariable("sid")int id){
        try {
            logger.info("尝试获取指定样式："+id);
            return SysMsg.success().add("style",sysStyleService.getStyle(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加样式
     * @param sysStyle
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addStyle(@RequestBody SysStyle sysStyle) {
        try {
            logger.info("尝试添加样式："+sysStyle);
            return SysMsg.success().add("state",sysStyleService.addStyle(sysStyle));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改样式
     * @param sysStyle
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateStyle(@RequestBody SysStyle sysStyle) {
        try {
            logger.info("尝试修改样式："+sysStyle);
            return SysMsg.success().add("state",sysStyleService.updateStyle(sysStyle));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除样式
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{sid}")
    public SysMsg deleteStyle(@PathVariable("sid") int id) {
        try {
            logger.info("尝试删除样式："+id);
            return SysMsg.success().add("state",sysStyleService.deleteStyle(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
