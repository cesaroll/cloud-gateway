package com.consumers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

  @GetMapping("/message")
  public String message() {
    return "Hello from consumers API";
  }
}
