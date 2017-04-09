package org.okan.java.service;

import org.okan.java.aspect.Loggable;
import org.okan.java.model.Circle;
import org.okan.java.model.Triangle;

/**
 * Created by okan on 4.04.2017.
 */
public class ShapeService {
  private Circle circle;
  private Triangle triangle;

  @Loggable
  public Circle getCircle() {
    System.out.println("circle getter called.");
    return circle;
  }

  public void setCircle(Circle circle) {
    this.circle = circle;
  }

  public Triangle getTriangle() {
    return triangle;
  }

  public void setTriangle(Triangle triangle) {
    this.triangle = triangle;
  }
}
