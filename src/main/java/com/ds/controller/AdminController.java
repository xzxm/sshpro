package com.ds.controller;

import com.ds.domain.Admin;
import com.ds.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/isAdmin")
    @ResponseBody
    public String isAdmin(Admin admin) {
        System.out.println("==========="+admin.getUsername());
        Admin admin1=adminService.findAdmin(admin);
        if (admin1 !=null){
            return "true";
        }
        return "false";
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }
}
