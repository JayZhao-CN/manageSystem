package com.pp.managesystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.service.SysTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public SysMsg getAllTypes(@RequestParam(value = "pageNum")Integer pageNum,
                              @RequestParam(value = "pageSize")Integer pageSize,
                              @RequestParam("tCompany")String tCompany){

        try {
            logger.info("尝试获取所有类型");
            PageHelper.startPage(pageNum,pageSize);
            List<SysType> allTypes = sysTypeService.getByCompany(tCompany);
            PageInfo<SysType> pageInfo = new PageInfo<>(allTypes);
            return SysMsg.success().add("dataInfo",pageInfo);
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
    @PostMapping("/add")
    public SysMsg addType(SysType sysType) {
        try {
            // 校验种类是否存在
            SysType sysType1 = sysTypeService.selectByNameAndCompany(sysType.gettName(), sysType.gettCompany());
            if (null != sysType1) {
                return SysMsg.failed().add("msg",sysType1.gettName()+" 已存在！编号为：" + sysType1.gettCode());
            }

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
    @PostMapping("/change")
    public SysMsg updateType(SysType sysType) {
        try {
            // 校验type是否存在
            SysType sysType1 = sysTypeService.selectByNameAndCompany(sysType.gettName(), sysType.gettCompany());
            if (null != sysType1 && !sysType1.gettId().equals(sysType.gettId())) {
                return SysMsg.failed().add("msg",sysType1.gettName()+" 已存在！编号为：" + sysType1.gettCode());
            }

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
    @GetMapping("/delete")
    public SysMsg deleteType(@RequestParam("tId")int id,@RequestParam("tCompany")String company) {
        try {
            logger.info("尝试删除类型："+id);
            return SysMsg.success().add("state",sysTypeService.deleteType(id,company));
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





}
