package org.okan.java.service;

import org.okan.java.aspect.LoggingAspect;
import org.okan.java.model.Circle;

/**
 * Created by okan on 9.04.2017.
 */
public class ShapeServiceProxy extends ShapeService {
  public Circle getCircle() {
    new LoggingAspect().loggingAdvice();
    return super.getCircle();
  }
}
