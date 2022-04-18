package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysProcessMapper;
import com.pp.managesystem.entity.SysProcess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SysProcessService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysProcessMapper sysProcessMapper;

    /**
     * 根据公司查询尺寸
     * @param company
     * @return
     */
    public List<SysProcess> getByCompany(String company){
        return sysProcessMapper.selectByCompany(company);
    }

    public SysProcess selectByNameAndCompany(String name, String company) {
        return sysProcessMapper.selectByNameAndCompany(name,company);
    }

    /**
     * 添加颜色生成编号
     * @param sysProcess
     * @return
     */
    public Integer addProcess(SysProcess sysProcess) {

        /**
         * 生成编号 年月日+编号
         */
        String[] ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).split("-");
        String year = ymd[0].substring(2, 4);
        // 生成了年月日
        String perCode = year + ymd[1] + ymd[2];
        // 查询当前日期最大编号
        String maxCode = sysProcessMapper.selectMaxCode(perCode);// 220405 10
        // 默认为年月日+1
        String prcCode = perCode + 1;
        // 查询为年月日+max+1
        if (maxCode != null && !maxCode.equals("")) {
            // 这个才是当日最大
            String currentNum = maxCode.substring(6);
            prcCode = maxCode.substring(0,6) + (Integer.parseInt(currentNum) + 1);
        }
        sysProcess.setPrcCode(prcCode);

        return sysProcessMapper.insert(sysProcess);
    }

    public Integer updateProcess(SysProcess sysProcess) {
        return sysProcessMapper.updateByPrimaryKeySelective(sysProcess);
    }

    public int deleteProcess(int id, String company) {
        SysProcess sysProcess = sysProcessMapper.selectByPrimaryKey(id);
        if (sysProcess.getPrcCompany().equals(company)) {
                return sysProcessMapper.updateByPrimaryKeySelective(new SysProcess(id,"/"+company));
            }else {
                return -1;
            }
        }
}
