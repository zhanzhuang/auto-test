package com.example.autotest.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * 方法分组目前失败
 */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端组的测试方法2");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是客户端组的测试方法3");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端组的测试方法4");
    }

    @BeforeGroups(groups = "server", alwaysRun = true)
    public void beforeServer() {
        System.out.println("this is before groups server");
    }

    @AfterGroups(groups = "server", alwaysRun = true)
    public void afterServer() {
        System.out.println("this is after groups server");
    }
}
