package com.example.autotest.testng.multithread;

import org.testng.annotations.Test;

/**
 * 多线程测试，annotation方式
 */
public class MultithreadOnAnnotation {
    // 执行100次，三个线程
    @Test(invocationCount = 100, threadPoolSize = 3)
    public void test() {
        System.out.println("多线程测试");
        System.out.printf(" thead id : %s%n", Thread.currentThread().getId());


    }
}
