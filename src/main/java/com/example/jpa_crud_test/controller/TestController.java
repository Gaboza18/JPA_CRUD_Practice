package com.example.jpa_crud_test.controller;

import com.example.jpa_crud_test.dto.TestDto;
import com.example.jpa_crud_test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @GetMapping("/test/{str}")
    public String test(@PathVariable String str){
        TestDto res = testService.testServiceMethod(str);

        return "Hello " +res.getTestStr();
    }
}
