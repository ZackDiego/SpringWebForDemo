package org.example.simpleweb.service.impl;

import org.example.simpleweb.service.DemoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoServiceImplTest {
    private final DemoService demoService = new DemoServiceImpl();

    @Test
    public void testGreet() {
        String greeting = demoService.greet();
        assertEquals("Hello, World!", greeting);
    }
}
