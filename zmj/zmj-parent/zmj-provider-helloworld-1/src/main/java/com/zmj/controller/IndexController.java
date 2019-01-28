package com.zmj.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	
	@RequestMapping("/index/{name}")
	public String helloworld(@PathVariable() String name) {
		return "1: Hello World! And "+name;
	}
}
