package com.example.autotest.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1() {
        System.out.println("this is ignore1");
    }

    @Test(enabled = false)
    public void ignore2() {
        System.out.println("this is ignore2");
    }

    @Test(enabled = true)
    public void ignore3() {
        System.out.println("this is ignore3");
    }
}
