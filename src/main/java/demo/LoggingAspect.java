package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jp){
        String args= jp.getArgs()[0].toString();
        //System.out.println(jp.getSignature());
        System.out.println("Logger with args:"+ args);
    }
    @After("execution(* *.*.checkout(..))")
    public void AfterLogger(){
        System.out.println("after logger");
    }
    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void returnPointCut(){}

    @AfterReturning(pointcut = "returnPointCut()" ,returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("returning:" + retVal);

    }
}
