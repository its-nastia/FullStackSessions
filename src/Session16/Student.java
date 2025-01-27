package Session16;

import java.io.Serializable;

public class Student implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public Student() {

    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", age: " + age + ", grade: " + grade;
    }
    public String toCsv() {
        return id + "," + name + "," + age + "," + grade;
    }
    public static Student fromCsv(String csv) {
        String[] parts = csv.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int age = Integer.parseInt(parts[2]);
        double grade = Double.parseDouble(parts[3]);
        return new Student(id, name, age, grade);
    }
}
