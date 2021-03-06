package com.ly.train.flower.common.sample.programflow;

import com.ly.train.flower.common.service.Service;

public class ServiceA implements Service<String> {

  private ClassA ca;

  public ServiceA() {
    this.ca = new ClassA();
  }

  @Override
  /**
   * trim service
   */
  public Object process(String message) {
    ca.f();
    if (message != null && message instanceof String) {
      return ((String) message).trim();
    }
    return "";
  }



}
