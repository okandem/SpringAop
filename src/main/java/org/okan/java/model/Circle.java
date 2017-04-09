package org.okan.java.model;

/**
 * Created by okan on 4.04.2017.
 */
public class Circle {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
//    System.out.println("Circle's setter called.");
//    throw(new RuntimeException());
  }

  public String setNameandReturn(String name){
    this.name=name;
    System.out.println("Circle's setter called");
    return name;
  }
}
