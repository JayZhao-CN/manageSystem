package com.pp.managesystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.dao.SysPositionMapper;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysPosition;
import com.pp.managesystem.service.SysPositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("sys_position")
public class SysPositionController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysPositionService sysPositionService;

    @Autowired
    SysPositionMapper sysPositionMapper;

    /**
     * 获取所有职位
     * @return SysMsg
     */
    @GetMapping
    public SysMsg getAllPositions(){
        try {
            logger.info("尝试获取所有职位");
            return SysMsg.success().add("positions",sysPositionService.getAllPositions());
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
    /**
     * 获取某公司所有职位
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllPositionsByCompany(@RequestParam(value = "pageNum",required = false)Integer pageNum,
                                           @RequestParam(value = "pageSize",required = false)Integer pageSize,@RequestParam("company")String company){
        try {
            logger.info("尝试获取所有职位");
            List<SysPosition> allPositions = new ArrayList<>();
            if (pageNum == null || pageSize == null){
                allPositions = sysPositionService.getPositionByCompany(company);
            }else {
                PageHelper.startPage(pageNum,pageSize);
                allPositions = sysPositionService.getPositionByCompany(company);
            }
            PageInfo<SysPosition> pageInfo = new PageInfo<>(allPositions);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 根据编号查询职位
     * @return
     */
    @PostMapping("/code")
    public SysMsg getPositionByCode(@RequestBody List<String> positions){
        try {
            logger.info("尝试获取职位："+positions);
            List<SysPosition> positionNames = new ArrayList<>();
            for (String code : positions) {
                SysPosition sysPosition = sysPositionMapper.selectByPositionCode(code);
                positionNames.add(sysPosition);
            }
            return SysMsg.success().add("positionNames",positionNames);
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
