package com.example.log.controller;

import com.example.log.entity.User;
import com.example.log.enums.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {

    @PostMapping("/api/v1/user")
    public ResponseEntity<?> upsertUser(@RequestBody User user) {
        log.info("user:{}", user);
        return new ResponseEntity<>(ResultEnum.SUCCESS.toString(), HttpStatus.OK);
    }
}
