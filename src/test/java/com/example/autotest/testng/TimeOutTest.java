package com.example.autotest.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    // 期望在3s内得到响应结果
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test success");
    }

    @Test(timeOut = 3000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("test failed");
    }
}
