package com.example.demo.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DefaultController {

    @GetMapping(value = "testGet")
    public ResponseEntity<String> successfulGetRequest() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return ResponseEntity.ok(mapper.writeValueAsString("get"));
    }
    @PostMapping(value = "testPost")
    public ResponseEntity<String> successfulPostRequest() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return ResponseEntity.ok(mapper.writeValueAsString("post"));
    }
}
