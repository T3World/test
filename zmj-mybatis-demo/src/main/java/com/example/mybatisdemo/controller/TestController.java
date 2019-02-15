package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MyService service;

    @RequestMapping("/search/{database}/{table}")
    public String select(@PathVariable("database") String database,
                         @PathVariable("table") String table){
        return service.searchAll(database,table);
    }
}
