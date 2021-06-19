package com.example.autotest.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("SuiteConfig: this is before suite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("SuiteConfig: this is after suite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("SuiteConfig: this is before test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("SuiteConfig: this is after test");
    }
}
