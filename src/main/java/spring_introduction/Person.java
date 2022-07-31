package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Person {
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;


    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person is created");
    }
      public Person() {
        System.out.println("Person without parameters");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name in class Person");
        this.name = name;
    }

    public int getAge() {
        System.out.println("Setting age in class Person");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Set injection");
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
