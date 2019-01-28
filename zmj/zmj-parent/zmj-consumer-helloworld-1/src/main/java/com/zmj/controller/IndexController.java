package com.zmj.controller;

import com.zmj.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@Autowired
	private IndexService indexService;
	
	@RequestMapping("/{name}")
	public String helloworld(@PathVariable() String name) {
		return this.indexService.helloworld(name);
	}
}
