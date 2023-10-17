package com.happy.book.springboot.web;

import com.happy.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1
public class HelloController {

    @GetMapping("/hello")   // 2
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name, @RequestParam("amount") int amount) { // 1
        return new HelloResponseDto(name, amount);
    }
}
