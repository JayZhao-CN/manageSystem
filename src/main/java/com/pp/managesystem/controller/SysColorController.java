package com.pp.managesystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysColor;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.service.SysColorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sys_color")
public class SysColorController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysColorService sysColorService;

    /**
     * 获取所有颜色
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllColors(@RequestParam(value = "pageNum")Integer pageNum,
                               @RequestParam(value = "pageSize")Integer pageSize){
        try {
            logger.info("尝试获取所有颜色");
            PageHelper.startPage(pageNum,pageSize);
            List<SysColor> allColors = sysColorService.getAllColors();
            PageInfo pageInfo = new PageInfo(allColors);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定颜色
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{cid}")
    public SysMsg getColor(@PathVariable("cid")int id){
        try {
            logger.info("尝试获取颜色："+id);
            return SysMsg.success().add("color",sysColorService.getColor(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加颜色
     * @param sysColor
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addColor(@RequestBody SysColor sysColor) {
        try {
            logger.info("尝试添加颜色："+sysColor);
            return SysMsg.success().add("state",sysColorService.addColor(sysColor));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改颜色
     * @param sysColor
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateColor(@RequestBody SysColor sysColor) {
        try {
            logger.info("尝试修改颜色："+sysColor);
            return SysMsg.success().add("state",sysColorService.updateColor(sysColor));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除颜色
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{cid}")
    public SysMsg deleteColor(@PathVariable("cid") int id) {
        try {
            logger.info("尝试删除颜色："+id);
            return SysMsg.success().add("state",sysColorService.deleteColor(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
