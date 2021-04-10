package com.henjie.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        //把用户信息存在session中
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username",username);
        return "main";
    }
    @GetMapping("/main")
    public String main(){
        return "main";
    }
    @GetMapping("/gologin")
    public String login(){
        return "login";
    }

    @GetMapping("/goout")
    public String goout(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "login";
    }
}
