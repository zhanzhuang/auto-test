package com.example.autotest.testng.assertt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertDemo1 {
    @Test
    public void test1() {
        Assert.assertEquals("aaa", "aaa");
    }
    @Test
    public void test2() {
        Assert.assertEquals("aaa", "bbb");

    }

    @Test
    public void logDemo() {
        Reporter.log("这是我自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }
}
