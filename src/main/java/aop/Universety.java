package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Universety {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {

        Student student1 = new Student("Pavel", 4, 4.5);
        Student student2 = new Student("Ivan", 1, 3.5);
        Student student3 = new Student("Sveta", 5, 4.0);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
    public List<Student> getStudents() {
        System.out.println("Beginning work getStudent method");
        System.out.println(students.get(4));
        System.out.println("Information from method getStudents ");
        System.out.println(students + " method");
        return students;
    }

}
