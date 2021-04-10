package com.henjie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
public class EncodingController {
    @PostMapping("/chichi")
    public String test(String name, Model model){
        //过滤器解决乱码问题
        System.out.println(name);
        model.addAttribute("msg",name);
        return "hello";
    }
}
