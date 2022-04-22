package com.pp.managesystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysProcess;
import com.pp.managesystem.service.SysProcessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sys_process")
public class SysProcessController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysProcessService sysProcessService;

    /**
     * 获取所有
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllProcesses(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                              @RequestParam(value = "pageSize",defaultValue = "15")Integer pageSize,
                              @RequestParam("prcCompany")String prcCompany){
        try {
            logger.info("尝试获取所有工序");
            PageHelper.startPage(pageNum,pageSize);
            List<SysProcess> allProcesses = sysProcessService.getByCompany(prcCompany);
            PageInfo<SysProcess> pageInfo = new PageInfo<>(allProcesses);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加
     * @param sysProcess
     * @return SysMsg
     */
    @PostMapping("/add")
    public SysMsg addProcess(SysProcess sysProcess) {

        try {
            // 校验工序是否存在
            SysProcess sysProcess1 = sysProcessService.selectByNameAndCompany(sysProcess.getPrcName(), sysProcess.getPrcCompany());
            if (null != sysProcess1) {
                return SysMsg.failed().add("msg",sysProcess1.getPrcCompany()+" 已存在！编号为：" + sysProcess1.getPrcCode());
            }

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
    @PostMapping("/change")
    public SysMsg updateProcess(SysProcess sysProcess) {
        try {
            // 校验工序是否存在
            SysProcess sysProcess1 = sysProcessService.selectByNameAndCompany(sysProcess.getPrcName(), sysProcess.getPrcCompany());
            if (null != sysProcess1 && !sysProcess1.getPrcId().equals(sysProcess.getPrcId())) {
                return SysMsg.failed().add("msg",sysProcess1.getPrcName()+" 已存在！编号为：" + sysProcess1.getPrcCode());
            }

            logger.info("尝试修改工序："+sysProcess);
            return SysMsg.success().add("state",sysProcessService.updateProcess(sysProcess));
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
    @GetMapping("/delete")
    public SysMsg deleteSize(@RequestParam("prcId")int id,@RequestParam("prcCompany")String company) {
        try {
            logger.info("尝试删除工序："+id);
            return SysMsg.success().add("state",sysProcessService.deleteProcess(id,company));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
