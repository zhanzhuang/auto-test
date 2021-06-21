package com.example.autotest.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodUtilTest {
    @Test
    public void reverseTest() {
        String str = MethodUtil.reverse("abc");
        Assert.assertEquals(str, "cba");
    }
    @Test
    public void willFailure() {
        int i = 1/0;
    }
}
