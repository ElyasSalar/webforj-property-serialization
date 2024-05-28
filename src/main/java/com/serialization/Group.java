package com.serialization;

import java.util.List;

public class Group {
  private String label;
  private List<Person<?>> people;

  public Group(String label, List<Person<?>> people) {
    this.label = label;
    this.people = people;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<Person<?>> getPeople() {
    return people;
  }

  public void setPeople(List<Person<?>> people) {
    this.people = people;
  }
}
