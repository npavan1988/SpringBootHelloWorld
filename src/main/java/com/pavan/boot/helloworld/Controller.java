package com.pavan.boot.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by nannapanenipavan on 12/17/16.
 */
@RestController
public class Controller {

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
