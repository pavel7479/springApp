package spring_introduction;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person without arguments");
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
