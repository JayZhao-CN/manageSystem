package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysPosition;
import com.pp.managesystem.service.SysPositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sys_position")
public class SysPositionController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysPositionService sysPositionService;

    /**
     * 获取所有职位
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllPositions(){
        try {
            logger.info("尝试获取所有职位工序");
            return SysMsg.success().add("positions",sysPositionService.getAllPositions());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定职位
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{pid}")
    public SysMsg getPosition(@PathVariable("pid")int id){
        try {
            logger.info("尝试获取职位："+id);
            return SysMsg.success().add("position",sysPositionService.getPosition(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加职位
     * @param sysPosition
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addPosition(@RequestBody SysPosition sysPosition) {
        try {
            logger.info("尝试添加职位："+sysPosition);
            return SysMsg.success().add("state",sysPositionService.addPosition(sysPosition));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改职位
     * @param sysPosition
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updatePosition(@RequestBody SysPosition sysPosition) {
        try {
            logger.info("尝试修改职位："+sysPosition);
            return SysMsg.success().add("state",sysPositionService.updatePosition(sysPosition));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除职位
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{pid}")
    public SysMsg deletePosition(@PathVariable("pid") int id) {
        try {
            logger.info("尝试删除职位："+id);
            return SysMsg.success().add("state",sysPositionService.deletePosition(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
