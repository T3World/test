package com.zmj.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="zmj-provider-helloworld")
public interface IndexService {
	
	@RequestMapping("/index/{name}")
	public String helloworld(@PathVariable() String name);
}
