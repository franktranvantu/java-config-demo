package com.franktran.spring.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class DemoController {

  @GetMapping
  public String hello(Model model) {
    model.addAttribute("message", "Hello World");
    return "hello";
  }
}
