package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.pointcutAllAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if(methodSignature.getName() == "addBook") {
            Object [] obj = joinPoint.getArgs();
            for (Object o : obj) {
                if (o instanceof Book) {
                    System.out.println("Information about book " + ((Book) o).getName() + " Author "
                                    + ((Book) o).getAuthor() + " data " + ((Book) o).getDateOfPublication());
                } else {
                    System.out.println("A book has be adding " + o);
                }
            }
        }
        System.out.println(joinPoint.getArgs());
        System.out.println("beforeAddLoggingAdvice: writing #3");
        System.out.println("-------------------------------------");
    }
}
