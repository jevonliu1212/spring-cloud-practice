package com.jevon.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {


    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        

        return "hello world";
    }

    @RequestMapping("/login.html")
    public String login(){

        return "login";
    }

    @RequestMapping("/error.html")
    public String error(){

        return "error";
    }

    @RequestMapping("/index.html")
    public String index(){

        return "index";
    }

    @RequestMapping("/header.html")
    public String header(){
        return "header";
    }
}
