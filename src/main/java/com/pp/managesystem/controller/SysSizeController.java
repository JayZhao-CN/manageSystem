package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysSize;
import com.pp.managesystem.service.SysSizeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sys_size")
public class SysSizeController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysSizeService sysSizeService;

    /**
     * 获取所有尺寸
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllSizes(){
        try {
            logger.info("尝试获取所有尺寸");
            return SysMsg.success().add("sizes",sysSizeService.getAllSizes());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定尺寸
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{sid}")
    public SysMsg getSize(@PathVariable("sid")int id){
        try {
            logger.info("尝试获取尺寸："+id);
            return SysMsg.success().add("size",sysSizeService.getSize(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加尺寸
     * @param sysSize
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addSize(@RequestBody SysSize sysSize) {
        try {
            logger.info("尝试添加尺寸："+sysSize);
            return SysMsg.success().add("state",sysSizeService.addSize(sysSize));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改尺寸
     * @param sysSize
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateSize(@RequestBody SysSize sysSize) {
        try {
            logger.info("尝试修改尺寸："+sysSize);
            return SysMsg.success().add("state",sysSizeService.updateSize(sysSize));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除尺寸
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{sid}")
    public SysMsg deleteSize(@PathVariable("sid") int id) {
        try {
            logger.info("尝试删除尺寸："+id);
            return SysMsg.success().add("state",sysSizeService.deleteSize(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
