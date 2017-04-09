package org.okan.java.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by okan on 9.04.2017.
 */
@Aspect
public class LoggingAspect {



  @Around("allGetters()")
  public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

    Object returnValue=null;

    try {
      System.out.println("Before Advice");
      returnValue =  proceedingJoinPoint.proceed();
      System.out.println("After Returning");
    }
    catch ( Throwable e) {
    System.out.println("After Throwing");
    }

    System.out.println("After Finally");
    return returnValue;
  }

  @Pointcut("execution(* get*())")
  public void allGetters(){}


  public void loggingAdvice() {
    System.out.println("logging from the advice.");
  }
}
