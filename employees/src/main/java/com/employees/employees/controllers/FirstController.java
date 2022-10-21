package com.employees.employees.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class FirstController {

  @GetMapping("/message")
  public String message() {
    return "Hello from employees API";
  }
}
