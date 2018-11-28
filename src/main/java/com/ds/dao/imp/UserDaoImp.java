package com.ds.dao.imp;

import com.ds.dao.UserDao;
import com.ds.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public List<User> findList() {
        List<User> list= hibernateTemplate.loadAll(User.class);
        return list;
    }

    @Override
    public void saveUser(User user) {
        hibernateTemplate.save(user);
    }

    @Override
    public User findUser(User user) {
        List<User>list=hibernateTemplate.findByExample(user);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public void updateUser(User user) {
        hibernateTemplate.update(user);
    }

    @Override
    public void deleteUser(User user) {
        hibernateTemplate.delete(user);
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
