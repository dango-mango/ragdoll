package com.github.dangomango.ragdoll.controller;

import com.github.dangomango.ragdoll.model.Diagnosis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
  @RequestMapping()
  public static Diagnosis getDiagnosis() {
    return Diagnosis.ok();
  }
}
