package com.henjie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    //原来的方式：http://localhost/henjie/test?a=1&b=2
    //Restful风格：http://localhost/henjie/test/1/2

    //只有value一个参数时，可以省略name，请求方法默认为GET（url路径的方式）
    //@RequestMapping(value = "/test/{a}/{b}",method = RequestMethod.GET)

    //以get的方式请求RequestMapping
    @GetMapping("/test/{a}/{b}")
    //@PathVariable 路径变量，让方法参数的值对应绑定到一个URL模板变量上。
    public String test(@PathVariable int a,@PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","result:"+res);
        return "test";
    }
}
