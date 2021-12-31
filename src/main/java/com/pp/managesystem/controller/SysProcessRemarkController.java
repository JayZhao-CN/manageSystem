package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysProcessRemark;
import com.pp.managesystem.service.SysProcessRemarkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("processremark")
public class SysProcessRemarkController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysProcessRemarkService sysProcessRemarkService;

    /**
     * 获取所有工序别称
     * @return SysMsg
     */
    @GetMapping
    public SysMsg getAllProcessRemarks(){
        try {
            logger.info("尝试获取所有工序别称");
            return SysMsg.success().add("processRemarks",sysProcessRemarkService.getAllProcessRemarks());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定工序别称
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{pid}")
    public SysMsg getProcessRemark(@PathVariable("pid")int id){
        try {
            logger.info("尝试工序别称："+id);
            return SysMsg.success().add("processRemark",sysProcessRemarkService.getProcessRemark(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加工序别称
     * @param sysProcessRemark
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addProcessRemark(@RequestBody SysProcessRemark sysProcessRemark) {
        try {
            logger.info("尝试添加工序别称："+sysProcessRemark);
            return SysMsg.success().add("state",sysProcessRemarkService.addProcessRemark(sysProcessRemark));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改工序别称
     * @param sysProcessRemark
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateProcessRemark(@RequestBody SysProcessRemark sysProcessRemark) {
        try {
            logger.info("尝试修改工序别称："+sysProcessRemark);
            return SysMsg.success().add("state",sysProcessRemarkService.updateProcessRemark(sysProcessRemark));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除工序别称
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{pid}")
    public SysMsg deleteProcessRemark(@PathVariable("pid") int id) {
        try {
            logger.info("尝试删除工序别称："+id);
            return SysMsg.success().add("state",sysProcessRemarkService.deleteProcessRemark(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
