package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversetyLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice() {
        System.out.println("beforeGetStudentsAdvice: logging taking list of students before getStudents");
    }
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        String name = firstStudent.getName();
        firstStudent.setName("Mr." + name);

        int cours = firstStudent.getCours();
        firstStudent.setCours(cours + 1);

        System.out.println("afterGetStudentsAdvice: logging taking list of students After getStudents");
    }
    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingExceptionGetStudentsAdvice(Throwable exception) {
        System.out.println("afterThrowingExceptionGetStudentsAdvice --- " + exception);
    }
    @After("execution(* getStudents())")
    public void afterAfterGetStudentException() {
        System.out.println("afterAfterGetStudentException");
    }
}
