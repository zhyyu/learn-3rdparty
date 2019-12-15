package com.zhyyu.learn.learn3rdparty.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/**
 * @author juror
 * @datatime 2019/12/15 15:09
 */
public class JsonObjectTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        OuterClass1 outerClass1 = new OuterClass1(1, 2,
                new InnerClass1(3, 4), Arrays.asList(new InnerClass1(5, 6), new InnerClass1(7, 8)), null);

        System.out.println(outerClass1);
        System.out.println(JSON.toJSONString(outerClass1));

//        System.out.println(BeanUtils.describe(outerClass1));

        JSONObject jsonObject = (JSONObject) JSON.toJSON(outerClass1);
        jsonObject.entrySet().forEach(stringObjectEntry -> {
            System.out.println(stringObjectEntry.getKey());
            System.out.println(stringObjectEntry.getValue());
        });

        System.out.println(jsonObject);
        System.out.println(jsonObject.getJSONObject("innerClass1"));

        Integer i = null;
        System.out.println(i);
    }

    @Data
    @AllArgsConstructor
    static class OuterClass1 {
        private int outer1;
        private Integer outerII1;

        private InnerClass1 innerClass1;
        private List<InnerClass1> innerClass1List;

        private InnerClass1 innerClass2;
    }

    @Data
    @AllArgsConstructor
    static class InnerClass1 {
        private int inneri1;
        private Integer innerII1;
    }

}
