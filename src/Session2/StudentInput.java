package Session2;

import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputDetails();
        student.displayDetails();
    }
}

class Student {
    int studentId;
    String firstName;
    String lastName;
    int age;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        studentId = scanner.nextInt();

        System.out.println("Enter First Name: ");
        firstName = scanner.next();

        System.out.println("Enter Last Name: ");
        lastName = scanner.next();

        System.out.println("Enter student age: ");
        age = scanner.nextInt();
        scanner.close();
    }

    public void displayDetails() {
        System.out.println("===== Student Details =====");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("===== Student Details =====");
    }
}