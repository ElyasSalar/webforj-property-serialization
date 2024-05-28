package com.serialization;

import com.google.gson.annotations.JsonAdapter;

// uncomment the following annotation to configure the type adapter
// for proper serialization of this class.
//@JsonAdapter(Adapter.class)
public abstract class Person<T extends Person<T>> {
  private String name;

  protected abstract T getThis();

  public String getName() {
    return name;
  }

  public T setName(String name) {
    this.name = name;
    return getThis();
  }
}
