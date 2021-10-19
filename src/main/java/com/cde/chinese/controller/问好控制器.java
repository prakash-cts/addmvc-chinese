package com.cde.chinese.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class 问好控制器 {
    /**
     * Sample Chinese application for language detection
     参数
     检查一下Spring Boot提供的beans - Chinese Sample text
     */
    @RequestMapping("/ch")
    public String 索引() {
        return "Spring Boot问好!";
    }

}