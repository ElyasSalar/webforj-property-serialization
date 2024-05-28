package com.serialization;

public class Joe extends Person<Joe> {
  private int age;

  @Override
  protected Joe getThis() {
    return this;
  }

  public int getAge() {
    return age;
  }

  public Joe setAge(int age) {
    this.age = age;
    return this;
  }
}
