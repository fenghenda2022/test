package com.exp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("jdk11")
public class Hello {
    @RequestMapping("")
    public String hello() {
        return "jdk11";
    }
    @RequestMapping("/jdk111")
    String index() {
        return "Hello jdk1111";
    }}

