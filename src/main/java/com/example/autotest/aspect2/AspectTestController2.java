package com.example.autotest.aspect2;

import com.example.autotest.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectTestController2 {

    @GetMapping("test11")
    @ResponseBody
    public void test11(@RequestBody User user) {
        System.out.println("this is test11" + user.toString());

    }
}
