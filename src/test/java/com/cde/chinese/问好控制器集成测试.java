package com.cde.chinese;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class 问好控制器集成测试 {

    @LocalServerPort
    private int 端口;

    private URL 基础网址;

    @Autowired
    private TestRestTemplate 模板;

    @Before
    public void 初始化() throws Exception {
        this.基础网址 = new URL("http://localhost:" + 端口 + "/ch");
    }

    @Test
    public void 取问好() throws Exception {
        ResponseEntity<String> 响应 = 模板.getForEntity(基础网址.toString(),
                String.class);
        assertEquals(响应.getBody(), "Spring Boot问好!");
    }
}