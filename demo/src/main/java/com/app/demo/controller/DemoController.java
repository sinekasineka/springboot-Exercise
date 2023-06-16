package com.app.demo.controller;

import com.app.demo.entity.Demo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class DemoController {
    @RequestMapping(value = "/demo")
    public List<Demo> getDemo() {
        new Demo(name="sineka",number="3",)


        return demoList;


    }
}