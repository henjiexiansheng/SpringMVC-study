package com.henjie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 代表这个类被Spring接管，被这个注解的类，
 * 中的所有方法，如果返回值是String，
 * 并且有具体页面可以跳转，那么就会被视图解析器解析
 */
@Controller
public class ControllerDemoTest2 {
    @RequestMapping("/hello")
    public String hello(Model model){
        //封装Model
        model.addAttribute("msg","henjie");
        //视图逻辑名
        return "hello"; // /WEB-INF/jsp/hello.jsp
    }
}
