package com.cafuc.controller;

import com.cafuc.domain.User;
import com.cafuc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/Login")
    public String Login(User user, HttpServletRequest request){
        try {
            User u = userService.Login(user);
            if(u != null){
                request.getSession().setAttribute("USER_SESSION", u);
                System.out.println("success");
                return "redirect:/admin/login.jsp";
            }
            request.setAttribute("msg", "用户名或密码错误");
            return "forward:/admin/login.jsp";
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msg", "系统错误 1");
            return "forward:/admin/login.jsp";
        }
    }
}
