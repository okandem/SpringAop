package org.okan.java.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by okan on 9.04.2017.
 */
@Aspect
public class LoggingAspect {

  @Before("allCircleMethods()")
  public void LoggingAdvice(JoinPoint joinPoint){

  }

  @AfterReturning(pointcut = "args(name)",returning = "returnString")
  public void stringArgumentMethods(String name, Object returnString){
    System.out.println("A method that takes String arguments has been called "+name+
        "The output value is "+ returnString );
  }

  @AfterThrowing(pointcut = "args(name)",throwing = "ex")
  public void exceptionAdvice(String name,Exception ex ){
    System.out.println("An exception has been thrown "+ ex);
  }

  @Around("@annotation(org.okan.java.aspect.Loggable)")
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

  @Pointcut("within(org.okan.java.model.Circle)")
  public void allCircleMethods(){}

}
