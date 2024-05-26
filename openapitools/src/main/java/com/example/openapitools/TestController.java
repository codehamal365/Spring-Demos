package com.example.openapitools;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "测试Controller")
@RequestMapping("/")
public class TestController {
    @GetMapping("test")
    @Operation(description = "测试接口",tags = "测试Controller")
    public String test()
    {
        return "success";
    }
}