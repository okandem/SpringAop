package org.okan.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by okan on 9.04.2017.
 */
@Aspect
public class LoggingAspect {

  @Before("allGetters()")
  public void LoggingAdvice(){
    System.out.println("Advice run. Get Method called.");
  }

  @Before("allGetters()")
  public void secondAdvice(){
    System.out.println("Second advice executed.");
  }

  @Pointcut("execution(* get*())")
  public void allGetters(){}

}
