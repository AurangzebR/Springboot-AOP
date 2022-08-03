package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void AuthenticatingPointCut(){

    }
    @Pointcut("within(demo..*)")
    public void AuthorizationPointCut(){

    }
    @Before("AuthenticatingPointCut() && AuthorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }
}
