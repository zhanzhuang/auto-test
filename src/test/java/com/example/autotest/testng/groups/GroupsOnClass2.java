package com.example.autotest.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void test1() {
        System.out.println("GroupsOnClass2 -> test1 -> ");
    }

    public void test2() {
        System.out.println("GroupsOnClass2 -> test2 -> ");
    }
}
