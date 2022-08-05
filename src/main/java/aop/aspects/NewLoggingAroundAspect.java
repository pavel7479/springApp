package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAroundAspect {
    @Around("execution(* returnBook())")
    private Object aroundReturnMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnMethod: " + "returning a book");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e) {
            System.out.println("Thwrovable exception from around " + e);
            throw e;
        }
       // targetMethodResult = "Ten years ago";
        System.out.println("aroundReturnMethod: " + "returned the book " + targetMethodResult);
        return targetMethodResult;
    }
}
