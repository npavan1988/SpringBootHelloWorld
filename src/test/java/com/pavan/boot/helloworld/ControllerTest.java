package com.pavan.boot.helloworld;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.jvm.hotspot.HelloWorld;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {TestConfiguration.class} )
public class ControllerTest {

    @Autowired
    private Controller controller;


    @Test
    public void testHello(){
        assertEquals("Hello World", controller.greetWorld());
    }

    @Test
    public void greetInLangTest(){
        assertEquals("Namaste World", controller.greetWorldInLang("HI"));
        assertEquals("Hello World", controller.greetWorldInLang("EN"));
        assertEquals("Bonjour World", controller.greetWorldInLang("FR"));
        assertEquals("Hola World", controller.greetWorldInLang("GR"));
        assertEquals("Hallo World", controller.greetWorldInLang("IT"));
        assertEquals("Ola World", controller.greetWorldInLang("PR"));
        assertEquals("Salaam World", controller.greetWorldInLang("PS"));
    }

    @Test
    public void greetPersonTest(){
        assertEquals("[Namaste pavan, Ola pavan, Salaam pavan, Hello pavan, Hola pavan, Hallo pavan, Bonjour pavan]", controller.greetPerson("pavan"));


    }
}
