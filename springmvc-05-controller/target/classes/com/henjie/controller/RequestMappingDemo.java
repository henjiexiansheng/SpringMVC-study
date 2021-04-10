package com.henjie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingDemo {
    @RequestMapping("/yeah")
    public String yeah(Model model){
        model.addAttribute("msg","oh yeah~~~!");
        return "yeah";
    }
}
