package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysUrlAuthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysUrlAuthService {
    @Autowired
    SysUrlAuthMapper sysUrlAuthMapper;


}
