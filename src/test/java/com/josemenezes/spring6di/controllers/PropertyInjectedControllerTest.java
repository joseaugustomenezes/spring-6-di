package com.josemenezes.spring6di.controllers;

import com.josemenezes.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProperlyInjectedControllerTest {

  ProperlyInjectedController properlyInjectedController;

  @BeforeEach
  void setUp() {
    properlyInjectedController = new ProperlyInjectedController();
    properlyInjectedController.greetingService = new GreetingServiceImpl();
  }

  @Test
  void sayHello() {
    System.out.println(properlyInjectedController.sayHello());
  }
}
