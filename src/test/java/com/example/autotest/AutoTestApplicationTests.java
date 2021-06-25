package com.example.autotest;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.TestNG;

import java.util.List;

@SpringBootTest
class AutoTestApplicationTests {
    public static void main(String[] args) {
        String testngXmlPath = System.getProperty("user.dir") + "/test-classes/testng/testng.xml";
        System.out.println("testngXmlPath:" + testngXmlPath);
        TestNG testNG = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add(testngXmlPath);
        testNG.setTestSuites(suites);
        testNG.run();
    }

}
