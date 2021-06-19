package com.example.autotest.testng;

import org.testng.annotations.Test;

/**
 * test2方法依赖test1执行成功
 * 如果test1执行失败，test2不会执行
 */
public class DependTest {

    @Test
    public void test1() {
        System.out.println("test1111111");
        throw new RuntimeException();

    }

    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2");
    }
}
