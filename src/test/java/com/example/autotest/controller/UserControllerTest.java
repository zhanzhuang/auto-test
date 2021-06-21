package com.example.autotest.controller;

import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.Asserts;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserControllerTest {
    @Test
    public void getUserTest() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8090/user");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        StatusLine statusLine = response.getStatusLine();

        System.out.println("response.getStatusLine():" + statusLine);
        String content = EntityUtils.toString(response.getEntity());
        System.out.println("content:" + content);
        EntityUtils.consume(response.getEntity());
        response.close();
        Assert.assertNotNull(content);
    }

}
