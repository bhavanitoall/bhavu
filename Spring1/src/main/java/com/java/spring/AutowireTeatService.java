package com.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowireTeatService {
  
        // ...
  private SampleService sampleService;
  
  @Autowired
  public AutowireTeatService(SampleService sampleService) {
    this.sampleService = sampleService;
  }
  
        // ...  
}
