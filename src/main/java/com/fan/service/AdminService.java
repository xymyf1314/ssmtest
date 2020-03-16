package com.fan.service;

import com.fan.pojo.Admin;

/**
 * @author Fan
 * @version 1.0
 * @date 2020/3/16 20:10
 */
public interface AdminService {
    /**
     * 通过用户名查找
     *
     * @param admin admin
     * @return Admin
     */
    public Admin findByName(Admin admin);
}
