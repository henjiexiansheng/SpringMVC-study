package com.henjie.controller;

import com.henjie.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/hello")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void test2(String name, Model model){
        System.out.println("a1:param"+name);
        if("henjie".equals(name)){
            model.addAttribute("msg", "true");
        }else {
            Model model1 = model.addAttribute("msg", "false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> users = new ArrayList<User>();
        //添加数据
        users.add(new User("henjie",23, "男"));
        users.add(new User("renlu",24, "男"));
        users.add(new User("wangjue",23, "男"));
        return users;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        if(name != null){
            if("admin".equals(name)){
                msg = "OK";
            }else {
                msg = "Error";
            }
        }
        if(pwd != null){
            if("123456".equals(pwd)){
                msg = "OK";
            }else {
                msg = "Error";
            }
        }
        return msg;
    }
}
