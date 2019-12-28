package com.zhyyu.learn.learn3rdparty.fastjson;

import com.alibaba.fastjson.JSON;

/**
 * @author juror
 * @datatime 2019/12/15 15:49
 */
public class JsonTest {

    public static void main(String[] args) {
        String str1 = "{\"innerClass1\":{\"innerII1\":4,\"inneri1\":3},\"innerClass1List\":[{\"innerII1\":6,\"inneri1\":5},{\"innerII1\":8,\"inneri1\":7}],\"outer1\":1,\"outerII1\":2}";
        String str2 = "[{\"innerII1\":6,\"inneri1\":5},{\"innerII1\":8,\"inneri1\":7}]";
        String str3 = "{{\"innerClass1\":{\"innerII1\":4,\"inneri1\":3},\"innerClass1List\":[{\"innerII1\":6,\"inneri1\":5},{\"innerII1\":8,\"inneri1\":7}],\"outer1\":1,\"outerII1\":2}";
        String str4 = "[[{\"innerII1\":6,\"inneri1\":5},{\"innerII1\":8,\"inneri1\":7}]";
        System.out.println(JSON.isValid(str1));
        System.out.println(JSON.isValid(str2));
        System.out.println(JSON.isValid(str3));
        System.out.println(JSON.isValid(str4));
        System.out.println(JSON.isValid("1"));
        System.out.println(JSON.isValidArray("1"));
        System.out.println(JSON.isValidObject("1"));
    }

}
