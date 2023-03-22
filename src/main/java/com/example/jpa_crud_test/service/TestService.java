package com.example.jpa_crud_test.service;

import com.example.jpa_crud_test.dto.TestDto;
import com.example.jpa_crud_test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public TestDto testServiceMethod(String str){
        TestDto testDto = new TestDto(str);

        return testDto;
    }
}
