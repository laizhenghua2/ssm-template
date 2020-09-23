package com.howie.service.impl;

import com.howie.dao.UserDao;
import com.howie.domain.User;
import com.howie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userServiceImpl") // <bean id="userServiceImpl" class="com.howie.service.impl.UserServiceImpl"><!bean>
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        System.out.println("业务层：查询所有的用户信息。");
        return userDao.findAll();
    }

    @Override
    public int saveUser(User user) {
        System.out.println("业务层：保存账户。");
        return userDao.saveUser(user);
    }
}
