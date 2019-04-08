package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * 访问首页
     * @return
     */
    @RequestMapping("/")
    public String welcome(){
        return "home";
    }
}
