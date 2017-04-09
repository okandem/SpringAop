package org.koushik.javabrains.service;

import org.koushik.javabrains.model.Circle;
import org.koushik.javabrains.model.Triangle;

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
