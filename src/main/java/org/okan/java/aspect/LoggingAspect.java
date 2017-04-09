package org.okan.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by okan on 9.04.2017.
 */
@Aspect
public class LoggingAspect {

  @Before("execution(public String getName())")
  public void LoggingAdvice(){
    System.out.println("Advice run. Get Method called.");
  }

}
