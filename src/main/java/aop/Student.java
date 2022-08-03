package aop;

public class Student {
    private String name;
    private int cours;
    private double averegeRang;

    public Student(String name, int cours, double averegeRang) {
        this.name = name;
        this.cours = cours;
        this.averegeRang = averegeRang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public double getAveregeRang() {
        return averegeRang;
    }

    public void setAveregeRang(double averegeRang) {
        this.averegeRang = averegeRang;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                ", averegeRang=" + averegeRang +
                '}';
    }
}
