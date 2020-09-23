package com.howie.ssm_test;

import com.howie.dao.UserDao;
import com.howie.domain.User;
import com.howie.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SpringTest {
    @Test
    public void serviceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl service = context.getBean("userServiceImpl",UserServiceImpl.class);
        service.findAll();
    }

    @Test
    public void testMyBatis() throws IOException {
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        UserDao dao = session.getMapper(UserDao.class);
        // 查询所有数据
        List<User> userList = dao.findAll();
        for(User user:userList){
            System.out.println(user);
        }
        session.close();
        in.close();
    }
}
