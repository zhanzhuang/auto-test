package com.example.autotest.aspect1;

import com.example.autotest.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectTestController1 {

    @LogFilter("正常方法")
    @GetMapping("test1")
    @ResponseBody
    public void test1(@RequestBody User user) {
        System.out.println("This is test1" + user.toString());
    }

    @LogFilter("发生异常方法")
    @GetMapping("test2")
    @ResponseBody
    public void test2(@RequestBody User user) {
        System.out.println("This is test2" + user);
        int i = 1 / 0;
    }

    @LogFilter
    @GetMapping("test3")
    @ResponseBody
    public void test3(@RequestBody User user) {
        System.out.println("This is test3" + user);
    }

    @GetMapping("test4")
    @ResponseBody
    public void test4(@RequestBody User user) {
        System.out.println("This is test4" + user);
    }
}
