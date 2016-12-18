package com.pavan.boot.controller;

import com.pavan.boot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nannapanenipavan on 12/17/16.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService service;

    @RequestMapping("/hello")
    public String greetWorld() {
        return "Hello World";
    }

    @RequestMapping("/{lang}/hello")
    public String greetWorldInLang(@PathVariable("lang") String lang) {
        return service.greetInLang(lang);
    }

    @RequestMapping("/all/hello/{name}")
    public String greetPerson(@PathVariable("name") String name) {
        return service.greetPerson(name);
    }

}
