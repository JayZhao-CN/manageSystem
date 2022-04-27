package com.pp.managesystem.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.config.UploadPathConfig;
import com.pp.managesystem.entity.SysExtPropties;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.service.SysExtProptiesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jay
 * @since 2022-04-24
 */
@RestController
@RequestMapping("/sys_ext_propties")
@Slf4j
public class SysExtProptiesController {

    @Autowired
    SysExtProptiesService sysExtProptiesService;

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
                return SysMsg.success().add("image", imgUrl);
            } catch (Exception e) {
                return SysMsg.failed().add("msg", "图片上传失败！请重试");
            }
        }else {
            return SysMsg.failed().add("msg","图片上传失败！请重试");
        }
    }

    /**
     * 获取扩展属性列表
     * @return SysMsg
     */
    @GetMapping("/detail/{proptiesType}")
    public SysMsg getAllExtPropties(@RequestParam(value = "pageNum")Integer pageNum,
                               @RequestParam(value = "pageSize")Integer pageSize,
                               @RequestParam("company")String company,
                               @PathVariable("proptiesType")String proptiesType){
        try {
            log.info("获取扩展属性列表{}",proptiesType);
            PageHelper.startPage(pageNum,pageSize);
            List<Map> result = sysExtProptiesService.getByCompanyAndType(company, proptiesType);
            PageInfo<Map> pageInfo = new PageInfo<>(result);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }



    /**
     * 添加
     * @param sysExtPropties
     * @return SysMsg
     */
    @PostMapping("/add")
    public SysMsg addExtPropties(SysExtPropties sysExtPropties) {
        try {
            // 校验扩展属性是否存在
            SysExtPropties sysExtPropties1 = sysExtProptiesService.selectNameByProptiesCode(sysExtPropties.getName(), sysExtPropties.getProptiesCode());
            if (null != sysExtPropties1) {
                return SysMsg.failed().add("msg",sysExtPropties1.getName()+" 已存在！编号为：" + sysExtPropties1.getId());
            }

            Integer integer = sysExtProptiesService.addExtPropties(sysExtPropties);
            return SysMsg.success().add("state",integer);
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 修改
     * @param sysExtPropties
     * @return SysMsg
     */
    @PostMapping("/change")
    public SysMsg updateColor(SysExtPropties sysExtPropties) {
        try {
            // 校验样式是否存在
            SysExtPropties sysExtPropties1 = sysExtProptiesService.selectNameByProptiesCode(sysExtPropties.getName(), sysExtPropties.getProptiesCode());
            if (null != sysExtPropties1 && !sysExtPropties1.getId().equals(sysExtPropties.getId())) {
                return SysMsg.failed().add("msg",sysExtPropties1.getName()+" 已存在！编号为：" + sysExtPropties1.getId());
            }

            log.info("尝试修改扩展属性："+sysExtPropties);

            return SysMsg.success().add("state",sysExtProptiesService.uploadExtPropties(sysExtPropties));
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }


    /**
     * 删除样式
     * @param id
     * @return SysMsg
     */
    @GetMapping("/delete")
    public SysMsg deleteStyle(@RequestParam("id")int id,@RequestParam("company")String company) {
        try {
            log.info("尝试删除："+id);
            return SysMsg.success().add("state",sysExtProptiesService.deleteExtPropties(id));
        }catch (Exception e){
            log.error(e.toString());
            return SysMsg.failed();
        }
    }
}

