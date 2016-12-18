package com.pavan.boot;

import com.pavan.boot.controller.HelloWorldController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {TestConfiguration.class} )
public class ControllerTest {

    @Autowired
    private HelloWorldController helloWorldController;


    @Test
    public void testHello(){
        assertEquals("Hello World", helloWorldController.greetWorld());
    }

    @Test
    public void greetInLangTest(){
        assertEquals("Namaste World", helloWorldController.greetWorldInLang("HI"));
        assertEquals("Hello World", helloWorldController.greetWorldInLang("EN"));
        assertEquals("Bonjour World", helloWorldController.greetWorldInLang("FR"));
        assertEquals("Hola World", helloWorldController.greetWorldInLang("GR"));
        assertEquals("Hallo World", helloWorldController.greetWorldInLang("IT"));
        assertEquals("Ola World", helloWorldController.greetWorldInLang("PR"));
        assertEquals("Salaam World", helloWorldController.greetWorldInLang("PS"));
    }

    @Test
    public void greetPersonTest(){
        assertEquals("[Namaste pavan, Ola pavan, Salaam pavan, Hello pavan, Hola pavan, Hallo pavan, Bonjour pavan]", helloWorldController.greetPerson("pavan"));


    }
}
