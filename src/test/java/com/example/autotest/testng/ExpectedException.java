package com.example.autotest.testng;

import org.testng.annotations.Test;

/**
 * 什么时候会遇到异常测试：
 * 在我们期望结果为某一个异常的时候
 * 比如我们传入了某些不合法的参数的时候，程序抛出了异常
 */
public class ExpectedException {
    // 这是一个测试结果会失败的异常
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }

    // 这是一个测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
