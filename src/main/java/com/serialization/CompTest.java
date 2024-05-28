package com.serialization;

import com.webforj.component.element.ElementComposite;
import com.webforj.component.element.PropertyDescriptor;
import com.webforj.component.element.annotation.NodeName;

@NodeName("comp-test")
public class CompTest extends ElementComposite {
  PropertyDescriptor<Group> group = PropertyDescriptor.property("group", null);

  public Group getGroup() {
    return get(group);
  }

  public void setGroup(Group group) {
    set(this.group, group);
  }
}
