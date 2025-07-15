package com.my.stored.endpont.rest.controller;

import static org.junit.Assert.assertEquals;

import com.my.stored.endpoint.rest.controller.health.AdditionController;
import org.junit.jupiter.api.Test;

public class AdditionControllerTest {
  private final AdditionController subject = new AdditionController();

  @Test
  void addition_test() {
    assertEquals(3, subject.addition(1, 2));
  }

  @Test
  void addition_no_overflow() {
    assertEquals(3_000_000_000L, subject.addition(1_000_000_000, 2_000_000_000));
  }
}
