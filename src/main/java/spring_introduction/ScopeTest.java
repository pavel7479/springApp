package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();
        Person person = context.getBean("personBean", Person.class);
        String name = person.getName();
        System.out.println(name);
        context.close();
    }
}
