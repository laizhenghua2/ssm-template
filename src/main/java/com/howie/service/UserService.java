package com.howie.service;

import com.howie.domain.User;

import java.util.List;
public interface UserService {
    // 查询所有用户信息
    public List<User> findAll();
    // 保存用户信息
    public int saveUser(User user);
}
