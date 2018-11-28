package com.ds.service.imp;


import com.ds.dao.AdminDao;
import com.ds.domain.Admin;
import com.ds.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin findAdmin(Admin admin) {
        return adminDao.findAdmin(admin);
    }


    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }
}
