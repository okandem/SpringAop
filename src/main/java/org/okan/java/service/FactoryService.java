package org.okan.java.service;

import org.okan.java.model.Circle;
import org.okan.java.model.Triangle;

/**
 * Created by okan on 9.04.2017.
 */
public class FactoryService {
  public Object getBean(String beanType){
    if ( beanType.equals("shapeService")) return new ShapeServiceProxy();
    if ( beanType.equals("circle")) return new Circle();
    if ( beanType.equals("triangle")) return new Triangle();
    return null;
  }
}
