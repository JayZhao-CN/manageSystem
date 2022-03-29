package com.pp.managesystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysSize;
import com.pp.managesystem.service.SysSizeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public SysMsg getAllSizes(@RequestParam(value = "pageNum")Integer pageNum,
                              @RequestParam(value = "pageSize")Integer pageSize,
                              @RequestParam("sCompany")String sCompany){
        try {
            logger.info("尝试获取所有尺寸");
            PageHelper.startPage(pageNum,pageSize);
            List<SysSize> allSizes = sysSizeService.getByCompany(sCompany);
            PageInfo<SysSize> pageInfo = new PageInfo<>(allSizes);
            return SysMsg.success().add("dataInfo",pageInfo);
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
    @PostMapping("/add")
    public SysMsg addSize(SysSize sysSize) {

        try {
            // 校验尺寸是否存在
            SysSize sysSize1 = sysSizeService.selectByNameAndCompany(sysSize.getsName(), sysSize.getsCompany());
            if (null != sysSize1) {
                return SysMsg.failed().add("msg",sysSize1.getsName()+" 已存在！编号为：" + sysSize1.getsCode());
            }

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
    @PostMapping("/change")
    public SysMsg updateSize(SysSize sysSize) {
        try {
            // 校验尺寸是否存在
            SysSize sysSize1 = sysSizeService.selectByNameAndCompany(sysSize.getsName(), sysSize.getsCompany());
            if (null != sysSize1 && !sysSize1.getsId().equals(sysSize.getsId())) {
                return SysMsg.failed().add("msg",sysSize1.getsName()+" 已存在！编号为：" + sysSize1.getsCode());
            }

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
    @GetMapping("/delete")
    public SysMsg deleteSize(@RequestParam("sId")int id,@RequestParam("sCompany")String company) {
        try {
            logger.info("尝试删除尺寸："+id);
            return SysMsg.success().add("state",sysSizeService.deleteSize(id,company));
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
}
