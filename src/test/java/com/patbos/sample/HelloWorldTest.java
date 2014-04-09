package com.patbos.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {


    @Test
    public void testHello1() {
        assertEquals("Hello Patrik", new HelloWorld().sayHello("Patrik"));
    }

}
