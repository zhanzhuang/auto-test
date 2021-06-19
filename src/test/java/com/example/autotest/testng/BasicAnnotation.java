package com.example.autotest.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("this is after method");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("this is before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("this is after suite");
    }

    @Test
    public void testCase1() {
        System.out.println("this is test case 1");
    }
    @Test
    public void testCase2() {
        int i = 1/0;
        System.out.println("this is test case 2");

    }
}
