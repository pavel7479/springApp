package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Universety universety = context.getBean("universety", Universety.class);
        universety.addStudents();
        System.out.println(universety.getStudents());

        context.close();
    }
}
