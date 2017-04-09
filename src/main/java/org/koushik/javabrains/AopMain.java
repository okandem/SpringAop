package org.koushik.javabrains;

import org.koushik.javabrains.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by okan on 4.04.2017.
 */
public class AopMain {
  public static void main (String[] args){

    ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/spring.xml");
    ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
    System.out.println(shapeService.getCircle().getName());

  }
}
