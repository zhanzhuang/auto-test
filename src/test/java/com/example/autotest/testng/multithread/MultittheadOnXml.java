package com.example.autotest.testng.multithread;

import org.testng.annotations.Test;

public class MultittheadOnXml {

    @Test
    public void test1() {
        System.out.printf(" thead id : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.printf(" thead id : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.printf(" thead id : %s%n", Thread.currentThread().getId());
    }

}
