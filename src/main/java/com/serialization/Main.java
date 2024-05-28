package com.serialization;

import com.google.gson.Gson;
import com.webforj.App;
import com.webforj.component.html.elements.Div;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;

import java.util.List;

public class Main extends App {
  @Override
  public void run() throws WebforjException {
    Frame window = new Frame();

    Andy andy = new Andy();
    andy.setName("Andy").setHeight(180);

    Joe joe = new Joe();
    joe.setName("Joe").setAge(40);

    List<Person<?>> people = List.of(andy, joe);

    Group group = new Group("Group A", people);

    CompTest compTest = new CompTest();
    compTest.setGroup(group);

    String groupJson = new Gson().toJson(compTest.getGroup());

    window.add(compTest, new Div(groupJson));
  }
}