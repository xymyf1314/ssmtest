package com.fan.controller;

import com.fan.pojo.Admin;
import com.fan.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Fan
 * @version 1.0
 * @date 2020/3/16 20:22
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService service;

    @RequestMapping("toLogin")
    public String toLogin() {
        System.out.println("toLogin方法");
        return "login.jsp";
    }

    @RequestMapping("login")
    public String login(Admin admin) {
        System.out.println("-------------进入登陆方法--------------");
        String path = "";
        if (admin != null) {
            System.out.println(admin.getUsername());
            Admin byName = service.findByName(admin);
            if (byName != null && admin.getUsername().equals(byName.getUsername()) && admin.getPassword().equals(byName.getPassword())) {
                path = "success.jsp";
            } else {
                path = "login.jsp";
            }
            System.out.println("============登陆失败============");
        }
        return path;
    }
}
