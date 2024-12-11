package Session2;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        //Student id
        //first name
        //last name
        //age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        int studentId = scanner.nextInt();

        System.out.println("Enter First Name: ");
        String firstName = scanner.next();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.next();

        System.out.println("Enter student age: ");
        int age = scanner.nextInt();

        System.out.println("===== Student Details =====");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("===== Student Details =====");
        scanner.close();

    }
}
