package com.example.autotest.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void test1() {
        System.out.println("GroupsOnClass3 -> test1");
    }
    public void test2() {
        System.out.println("GroupsOnClass3 -> test2");
    }
}
