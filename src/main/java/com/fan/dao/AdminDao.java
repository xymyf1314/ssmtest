package com.fan.dao;

import com.fan.pojo.Admin;

/**
 * @author Fan
 * @version 1.0
 * @date 2020/3/16 20:08
 */
public interface AdminDao {
    /**
     * 通过用户名查找
     *
     * @param name admin.name
     * @return Admin
     */
    public Admin findByName(String name);

}
