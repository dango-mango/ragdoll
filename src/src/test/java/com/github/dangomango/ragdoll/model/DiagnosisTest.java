package com.github.dangomango.ragdoll.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiagnosisTest {
  @Test
  @DisplayName("Diagnoses with same status should equal")
  public void testEquals() {
    assertEquals(new Diagnosis("neko"), new Diagnosis("neko"));
  }

  @Test
  @DisplayName("Diagnoses with different status should not equal")
  public void testNotEquals1() {
    assertNotEquals(new Diagnosis("lorem"), new Diagnosis("ipsum"));
  }

  @Test
  @DisplayName("Diagnoses should not equal other types")
  public void testNotEquals2() {
    assertNotEquals(new Diagnosis("lorem"), 4);
  }
}
