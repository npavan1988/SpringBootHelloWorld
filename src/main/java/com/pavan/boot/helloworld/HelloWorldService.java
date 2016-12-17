package com.pavan.boot.helloworld;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by nannapanenipavan on 12/17/16.
 */
@Service
public class HelloWorldService {


    private Map<String, String> langHelloMap;

    public HelloWorldService() {
        langHelloMap = new ConcurrentHashMap<>();
        langHelloMap.put( "FR", "Bonjour" );
        langHelloMap.put( "EN", "Hello" );
        langHelloMap.put( "GR", "Hola" );
        langHelloMap.put( "IT", "Hallo" );
        langHelloMap.put( "PR", "Ola" );
        langHelloMap.put( "HI", "Namaste" );
        langHelloMap.put( "PS", "Salaam" );
    }

    public String greetInLang(String lang){
        return Optional.ofNullable(langHelloMap.get(lang))
                .map(hello -> hello + " World")
                .orElse("Hello World");
    }

    public String greetPerson(String name){
        return langHelloMap.values().stream()
                .map(hello -> hello + " " + name)
                .collect(Collectors.toList())
                .toString();
    }

}
