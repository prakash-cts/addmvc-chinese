package com.cde.chinese.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChineseController {

	@RequestMapping("/")
	public String chineseHelloWorld(){
		return "HelloWorld!";
	}
}
