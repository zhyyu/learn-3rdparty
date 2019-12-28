package com.zhyyu.learn.learn3rdparty.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author juror
 * @datatime 2019/12/15 15:54
 */
public class JsonObjectPutTest {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("i", "123");
        System.out.println(jsonObject.toJSONString());

        jsonObject.put("iObj", JSON.parseObject("{\"i\":\"123\"}"));
        System.out.println(jsonObject.toJSONString());

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("i", "123");
        paramMap.put("iObj", "{\"i\":\"123\"}");

        System.out.println(new JSONObject(paramMap));
    }

}
