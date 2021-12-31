package com.pp.managesystem.controller;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysProcess;
import com.pp.managesystem.service.SysProcessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("process")
public class SysProcessController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysProcessService sysProcessService;

    /**
     * 获取所有工序
     * @return SysMsg
     */
    @GetMapping
    public SysMsg getAllProcesses(){
        try {
            logger.info("尝试获取所有工序");
            return SysMsg.success().add("processes",sysProcessService.getAllProcesses());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取指定工序
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{pid}")
    public SysMsg getProcess(@PathVariable("pid")int id){
        try {
            logger.info("尝试获取工序："+id);
            return SysMsg.success().add("process",sysProcessService.getProcess(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加工序
     * @param sysProcess
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addProcess(@RequestBody SysProcess sysProcess) {
        try {
            logger.info("尝试添加工序："+sysProcess);
            return SysMsg.success().add("state",sysProcessService.addProcess(sysProcess));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改工序
     * @param sysProcess
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateProcess(@RequestBody SysProcess sysProcess) {
        try {
            logger.info("尝试修改工序："+sysProcess);
            return SysMsg.success().add("state",sysProcessService.updateProcess(sysProcess));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除工序
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{pid}")
    public SysMsg deleteProcess(@PathVariable("pid") int id) {
        try {
            logger.info("尝试删除工序："+id);
            return SysMsg.success().add("state",sysProcessService.deleteProcess(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
