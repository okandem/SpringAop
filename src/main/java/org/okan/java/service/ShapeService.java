package org.okan.java.service;

import org.okan.java.model.Circle;
import org.okan.java.model.Triangle;

/**
 * Created by okan on 4.04.2017.
 */
public class ShapeService {
  private Circle circle;
  private Triangle triangle;

  public Circle getCircle() {
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
