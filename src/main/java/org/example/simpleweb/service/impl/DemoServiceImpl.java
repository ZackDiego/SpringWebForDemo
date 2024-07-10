package org.example.simpleweb.service.impl;

import org.example.simpleweb.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String greet() {
        return "Hello, World!";
    }
}
