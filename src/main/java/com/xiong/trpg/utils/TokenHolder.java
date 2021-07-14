package com.xiong.trpg.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class TokenHolder {
    public static void setCurrentUser(String user){
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        request.getSession().setAttribute("user",user);
    }
    public static String getCurrentUser(){
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Object user = req.getSession().getAttribute("user");
        if (user != null) {
            return user.toString();
        }
        return "";
    }
}
