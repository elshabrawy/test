package com.example.Test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService service;

    @GetMapping("/hello")
    public ResponseEntity<String > sayHello(){
        return ResponseEntity.ok(service.sayHello());
    }
}
