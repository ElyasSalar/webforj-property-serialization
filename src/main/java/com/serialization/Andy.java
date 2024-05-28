package com.serialization;

public class Andy extends Person<Andy> {
  private int height;

  @Override
  protected Andy getThis() {
    return this;
  }

  public int getHeight() {
    return height;
  }

  public Andy setHeight(int height) {
    this.height = height;
    return this;
  }
}
