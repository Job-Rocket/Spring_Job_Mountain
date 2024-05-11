package com.example.job_mountain.config;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/health")
public class ElasticBeanstalkHealthCheck {

    @GetMapping
    public ResponseEntity<Object> getHealthCheck() {
        return new ResponseEntity<>("It Works!!!", HttpStatus.OK);
    }
}

