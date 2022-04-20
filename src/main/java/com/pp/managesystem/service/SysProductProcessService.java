package com.pp.managesystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pp.managesystem.entity.SysProductProcess;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jay
 * @since 2022-04-20
 */
public interface SysProductProcessService extends IService<SysProductProcess> {

    List<Map> getDetail(int pageNum, int pageSize, String company);

}
