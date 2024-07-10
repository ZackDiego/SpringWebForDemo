package org.example.simpleweb.controller;

import org.example.simpleweb.service.DemoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DemoControllerTest {
    @InjectMocks
    private DemoController demoController;

    @Mock
    private DemoService demoService;

    public DemoControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGreet() {
        when(demoService.greet()).thenReturn("Hello, World!");

        String greeting = demoController.greet();
        assertEquals("Hello, World!", greeting);
    }
}
