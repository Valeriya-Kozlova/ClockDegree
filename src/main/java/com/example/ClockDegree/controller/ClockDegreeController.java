package com.example.ClockDegree.controller;


import com.example.ClockDegree.service.ClockDegreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class ClockDegreeController {

    private final ClockDegreeService service;

    @GetMapping("/get-angle")
    @ResponseStatus(HttpStatus.OK)
    public String index() {
        return String.valueOf(service.getAngle(LocalDateTime.now()));
    }

}
