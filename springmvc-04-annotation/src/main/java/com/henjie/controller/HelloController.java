package com.henjie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller被扫描到后根据@RequestMapping("/hello")的class
//路径自动被分配，相当于原先的HandlerAdapter
@Controller
public class HelloController{

    //请求路径，代替原先的HandlerMapping和bean-id的映射方式，class路径就是当前类
    //@RequestMapping可以写在类上和方法上，类上先访问，方法后访问 /类上路径/方法路径/
    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","HelloSpringMVCAnnotation");
        return "hello"; //视图的逻辑名，会被视图解析器和前后缀拼接。 /WEB-INF/jsp/hello.jsp
    }
}
