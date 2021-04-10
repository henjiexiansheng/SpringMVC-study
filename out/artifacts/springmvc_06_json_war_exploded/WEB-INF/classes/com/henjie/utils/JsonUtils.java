package com.henjie.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.Map;

public class JsonUtils {
    public static String getJson(Object obj){
        return getJson(obj,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object obj,String dateFormat){
        ObjectMapper objectMapper = new ObjectMapper();             //Jackson对象
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);    //时间格式化常用类，参数为时间格式
        try {
            String str = objectMapper.writeValueAsString(sdf.format(obj));  //将格式化时间转化为JSON
            return str; //返回JSON
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
