package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Dog implements Pet {
    private String name;
    public Dog() {
        System.out.println("Dog is created");
    }
//    @PostConstruct
//    public void init() {
//        System.out.println("init method");
//    }
//    @PreDestroy
//    public void destroy() {
//        System.out.println("destroy method");
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
}
