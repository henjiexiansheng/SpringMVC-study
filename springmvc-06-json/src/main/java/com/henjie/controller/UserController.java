package com.henjie.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.henjie.pojo.User;
import com.henjie.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//@Controller 会走视图解析器
/***
 * 除了＠Controller本身功能外，该注解下所有方法只会返回JSON字符串，不走视图解析器。
 * 前后端分离项目，只会返回JSON
 */
@RestController
public class UserController {


    //produces 解决乱码问题
    @RequestMapping("/json1")
    //@ResponseBody   //配合@Controller使用，return的返回值便不会走视图解析器，会直接返回一个JSON字符串
    public String test3(){
        //Jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("恨劫",23,"男");

        //将一个值变成json字符串
        String str = null;
        try {
            str = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        //将json字符串直接返回
        return str;
    }

    @RequestMapping("/json2")
    public String test2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();

        User user1 = new User("恨劫1",23,"男");
        User user2 = new User("恨劫2",23,"男");
        User user3 = new User("恨劫3",23,"男");
        User user4 = new User("恨劫4",23,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String str = mapper.writeValueAsString(userList);

        return str;
    }

    //java常用类返回时间json
    @RequestMapping("/json3")
    public String test() throws JsonProcessingException {
        String str = JsonUtils.getJson(new Date());
        return str;
    }

    //fastjson
    @RequestMapping("/json4")
    public String test4() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("恨劫1",23,"男");
        User user2 = new User("恨劫2",23,"男");
        User user3 = new User("恨劫3",23,"男");
        User user4 = new User("恨劫4",23,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String str = JSON.toJSONString(userList);
        return str;
    }
}
