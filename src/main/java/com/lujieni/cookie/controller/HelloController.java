package com.lujieni.cookie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Package: com.lujieni.cookie.controller
 * @ClassName: HelloController
 * @Author: lujieni
 * @Description: 1
 * @Date: 2021-02-19 09:55
 * @Version: 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public void hello(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie:cookies) {
                System.out.println("name:"+cookie.getName());
                System.out.println("value:"+cookie.getValue());
            }
        }
       /* Cookie cookie = new Cookie("name","lujieni");
        cookie.setPath("/hello");
        response.addCookie(cookie);*/
    }



}