package com.howie.controller;

import com.howie.domain.User;
import com.howie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 用户web
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {
    /**
     * 查询所有用户信息
     */
    @Autowired  // UserService userService = new UserServiceImpl();
    private UserService userService;
    @RequestMapping(path = "/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有用户信息。。。");
        // 调用UserService的方法
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList); // 最终会存储到request域对象里
        return "list";
    }
    /**
     * 添加用户
     */
    @RequestMapping(path = "/saveUser")
    public void saveUser(String username, String balance, HttpServletResponse response, HttpServletRequest request) throws IOException {
        User user = new User();
        user.setId(3);
        user.setUsername(username);
        user.setBalance(Double.parseDouble(balance));
        int count = userService.saveUser(user);
        System.out.println(request.getContextPath());
        if(count == 1){
            response.sendRedirect(request.getContextPath()+"/user/findAll");
        }
    }
}
