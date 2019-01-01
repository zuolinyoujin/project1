package com.atguigu.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2018-09-01 下午 4:49
 */
@RestController
public class testController {
    @RequestMapping("/test")
    public String test01(){
        System.out.println("test");
        System.out.println("update");
        return "hello";
    }
    
    @RequestMapping("/main")
    public String test02(){
        System.out.println("test");
        System.out.println("update");
        return "hello";
    }

    public void test03(){

    }

    public void test04(){

    }
}
