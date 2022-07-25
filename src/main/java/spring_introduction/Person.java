package spring_introduction;

public class Person {
    private Pet pet;
    private String name;
    private int age;

    public Person() {
        System.out.println("Person without arguments");
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

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person is created");
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
