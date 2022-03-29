package com.pp.managesystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.config.UploadPathConfig;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysStyle;
import com.pp.managesystem.service.SysStyleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("sys_style")
public class SysStyleController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysStyleService sysStyleService;

    @Autowired
    UploadPathConfig uploadPathConfig;

    @PostMapping("/upload")
    public SysMsg getImg(@RequestParam("file") MultipartFile multipartFile) {

        //文件上传的地址
        String path = null;
        try {
            path = ResourceUtils.getURL("classpath:").getPath()+"static/upload";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String realPath = path.replace('/', '\\').substring(1,path.length());

        if (!new File(realPath).exists()) {
            new File(realPath).mkdirs();
        }

            // 获取上传文件的文件名
            String fileName = multipartFile.getOriginalFilename();

            long l = System.currentTimeMillis();
            // 真正地进行文件保存
            File targetFile = new File(realPath, l + fileName);

        if (!targetFile.exists()) {
            try {
                targetFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (targetFile.exists()) {
            try {
                // 写入文件
                multipartFile.transferTo(targetFile);
                int i = targetFile.toString().lastIndexOf("\\static");
                String imgUrl =uploadPathConfig.getPer()
                        + uploadPathConfig.getIp()
                        + ":"
                        + uploadPathConfig.getPort()
                        + targetFile.toString().substring(i);
                return SysMsg.success().add("stImg", imgUrl);
            } catch (Exception e) {
                return SysMsg.failed().add("msg", "图片上传失败！请重试");
            }
        }else {
            return SysMsg.failed().add("msg","图片上传失败！请重试");
        }
    }


    /**
     * 获取所有样式
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllStyles(@RequestParam(value = "pageNum")Integer pageNum,
                               @RequestParam(value = "pageSize")Integer pageSize,
                               @RequestParam("stCompany")String stCompany){
        try {
            logger.info("尝试获取所有样式");
            PageHelper.startPage(pageNum,pageSize);
            List<SysStyle> byCompany = sysStyleService.getByCompany(stCompany);
            PageInfo<SysStyle> pageInfo = new PageInfo<>(byCompany);
            return SysMsg.success().add("dataInfo",pageInfo);
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
    @PostMapping("/add")
    public SysMsg addStyle(SysStyle sysStyle) {
        try {
            // 校验样式是否存在
            SysStyle sysStyle1 = sysStyleService.selectByNameAndCompany(sysStyle.getStName(), sysStyle.getStCompany());
            if (null != sysStyle1) {
                return SysMsg.failed().add("msg",sysStyle1.getStName()+" 已存在！编号为：" + sysStyle1.getStCode());
            }

            logger.info("尝试添加样式："+sysStyle);
            Integer integer = sysStyleService.addStyle(sysStyle);
            return SysMsg.success().add("state",integer);
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
    @PostMapping("/change")
    public SysMsg updateColor(SysStyle sysStyle) {
        try {
            // 校验样式是否存在
            SysStyle sysStyle1 = sysStyleService.selectByNameAndCompany(sysStyle.getStName(), sysStyle.getStCompany());
            if (null != sysStyle1 && !sysStyle1.getStId().equals(sysStyle.getStId())) {
                return SysMsg.failed().add("msg",sysStyle1.getStName()+" 已存在！编号为：" + sysStyle1.getStCode());
            }

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
    @GetMapping("/delete")
    public SysMsg deleteStyle(@RequestParam("stId")int id,@RequestParam("stCompany")String company) {
        try {
            logger.info("尝试删除样式："+id);
            return SysMsg.success().add("state",sysStyleService.deleteStyle(id,company));
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

//    /**
//     * 添加样式
//     * @param sysStyle
//     * @return SysMsg
//     */
//    @PostMapping
//    public SysMsg addStyle(@RequestBody SysStyle sysStyle) {
//        try {
//            logger.info("尝试添加样式："+sysStyle);
//            return SysMsg.success().add("state",sysStyleService.addStyle(sysStyle));
//        }catch (Exception e){
//            logger.error(e.toString());
//            return SysMsg.failed();
//        }
//    }

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

//    /**
//     * 删除样式
//     * @param id
//     * @return SysMsg
//     */
//    @DeleteMapping("/{sid}")
//    public SysMsg deleteStyle(@PathVariable("sid") int id) {
//        try {
//            logger.info("尝试删除样式："+id);
//            return SysMsg.success().add("state",sysStyleService.deleteStyle(id));
//        }catch (Exception e){
//            logger.error(e.toString());
//            return SysMsg.failed();
//        }
//    }
}
