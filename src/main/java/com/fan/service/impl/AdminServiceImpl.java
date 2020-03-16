package com.fan.service.impl;

import com.fan.dao.AdminDao;
import com.fan.pojo.Admin;
import com.fan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fan
 * @version 1.0
 * @date 2020/3/16 20:13
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin findByName(Admin admin) {
        return adminDao.findByName(admin.getUsername());
    }
}
