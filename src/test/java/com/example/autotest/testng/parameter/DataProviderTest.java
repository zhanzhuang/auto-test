package com.example.autotest.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "key")
    public void testDataProvider(String name, int age) {
        System.out.println("testDataProvider:name = " + name + " , " + "age = " + age);

    }
    @DataProvider(name = "key")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"Jack", 10},
                {"Rose", 20}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1:" + "name=" + name + " , " + "age " +  age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2:" + "name=" + name + " , " + "age " +  age);
    }

    /**
     * 执行test1和test2方法会对应提供不同的数据
     * @param method
     * @return
     */
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"Jack", 20},
                    {"Rose", 15}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"Alex", 13},
                    {"Tim", 14}
            };
        }
        return result;
    }
}
