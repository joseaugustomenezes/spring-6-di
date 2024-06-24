package com.josemenezes.spring6di.controllers;

import com.josemenezes.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ProperlyInjectedController {

  GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
