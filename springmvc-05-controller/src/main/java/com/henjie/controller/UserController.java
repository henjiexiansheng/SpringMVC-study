package com.henjie.controller;

import com.henjie.pojo.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/test")
    /***
     * @RequestParam 为前端接收的参数名
     * 推荐只要是前端接收的变量名前，都加上此注解
     */
    public String user(@RequestParam("username") String name, Model model){
        //1、接收前端参数
        System.out.println("接收的前端参数为："+name);

        //2、将返回的结果传递给前端
        model.addAttribute("msg",name);

        //3、跳转视图
        return "test";
    }

    /***
     *  1、接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用。
     *  2、假设传递的是一个对象User，匹配User对象中的字段名：如果名字一致则OK，否则，匹配不到。
     */
    //前端提交的是一个对象
    @GetMapping("/test2")
    public String user2(User user,Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "test";
    }
}
