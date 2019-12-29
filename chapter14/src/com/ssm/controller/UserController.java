package com.ssm.controller;

import com.ssm.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @RequestMapping(value = "/toLogin" , method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session) {
        String username = user.getUsername();
        String password = user.getPassword();
        //迷你从数据库中获取用户名和密码
        if(username!=null&&username.equals("wujit")) {
            if (password!=null&&password.equals("123456")) {
                session.setAttribute("user_session",user);
                return "redirect:main";
            }
        }
        model.addAttribute("msg","用户名或密码错误，请重新输入");
        return "login";
    }
    @RequestMapping("/main")
    public String toMain() {
        return "main";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:toLogin";
    }
}
