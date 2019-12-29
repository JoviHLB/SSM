package com.ssm.interceptor;

import com.ssm.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String url=httpServletRequest.getRequestURI();
        //允许公开访问"/toLogin"
        if (url.indexOf("toLogin")>=0) return true;
        //允许公开访问"/login"
        if(url.indexOf("/login")>=0) return true;
        //获取session
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("user_session");
        if(user!=null) return true;
        httpServletRequest.setAttribute("msg","请你先登陆");
        httpServletRequest.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(httpServletRequest,httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
