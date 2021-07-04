package com.github.dangomango.ragdoll.model;

public class Diagnosis {
  private String status;

  public static Diagnosis ok() {
    return new Diagnosis("OK");
  }

  public Diagnosis(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }

  public boolean equals(Object o) {
    if (!(o instanceof Diagnosis)) return false;
    else return ((Diagnosis) o).getStatus().equals(getStatus());
  }
}
