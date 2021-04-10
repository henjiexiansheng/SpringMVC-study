package com.henjie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {
    @GetMapping("/chi")
    public String test(Model model){
        model.addAttribute("msg","henjie chixin");
        //存在视图解析器的情况下，默认视图跳转的方式是转发
        //如想设置为重定向，只需在试图逻辑名前加redirect:/
        return "redirect:hello";
    }
}
