package com.example.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {

    @Value(value = "${config.test}")
    public String test;

    @RequestMapping("/config")
    public String getConfig(){
        return test;
    }
}
