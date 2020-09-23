package com.howie.dao;

import com.howie.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户dao接口
 */
@Repository
public interface UserDao {
    // 查询所有用户信息
    @Select("select * from springdb.user_db")
    public List<User> findAll();
    // 保存用户信息
    @Insert("insert into springdb.user_db(id,username,balance) values(#{id},#{username},#{balance})")
    public int saveUser(User user);
}
