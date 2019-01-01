package com.pingan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2018-11-28 下午 4:23
 */
@Controller
public class UserController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
