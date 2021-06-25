package com.example.autotest.util;

import org.testng.Assert;
import org.testng.annotations.*;

public class MethodUtilTest {
    /**
     * simple test case
     */
    @Test
    public void demo1Test() {
        System.out.println("this is demo1Test");
        String str = MethodUtil.demo1("abc");
        Assert.assertEquals(str, "cba");
    }

    /**
     * this method will failure
     */
    @Test
    public void demo2Test() {
        System.out.println("this is demo2Test");
        int i = 1 / 0;
    }

    /**
     * ignore this case
     */
    @Test(enabled = false)
    public void demo3Test() {
        System.out.println("this is demo3Test");
    }

    /**
     * exception test case
     * test exception is NPE
     * error message is NPE test
     * @throws Exception
     */
    @Test(expectedExceptions = NullPointerException.class, expectedExceptionsMessageRegExp = "NPE test")
    public void demo4Test() throws Exception {
        System.out.println("this is demo4Test");
        throw new NullPointerException("NPE test");
    }

    /**
     * timeout test case
     * if method time more than 1s, will failure
     * @throws InterruptedException
     */
    @Test(timeOut = 1000)
    public void demo5Test() throws InterruptedException {
        System.out.println("this is demo5Test");
        Thread.sleep(1500);
    }

    /**
     * multi thread test case
     * invocationCount = invoke count
     * threadPoolSize = number of threads
     */
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void demo6Test() {
        System.out.println("this is demo6Test");
        long threadId = Thread.currentThread().getId();
        System.out.println("current thread id == " + threadId);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("this is before method, could do anything");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("this is after method, could do anything");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class, could do anything");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is before class, could do anything");
    }

}
