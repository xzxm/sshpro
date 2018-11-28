package com.ds.dao.imp;

import com.ds.dao.AdminDao;
import com.ds.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminDaoImp implements AdminDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public Admin findAdmin(Admin admin) {
        List<Admin> list=hibernateTemplate.findByExample(admin);
        if (list!=null && list.size()>0){
            return list.get(0);
        }
        return null;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
