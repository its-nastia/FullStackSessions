package Session6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgmt {
    static class Student {
        int id;
        String firstName;
        String lastName;
        int age;

        public Student(int id, String firstName, String lastName, int age) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int studentCount = 0;


        while(true) {
            System.out.println("==== Student Menu ====");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Delete student details");
            System.out.println("4. Exit");
            System.out.println("======================");
            System.out.println("Enter your choice: ");


            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    boolean idExists = false;
                    System.out.println("Enter student id: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        students.get(studentId);
                        idExists = true;
                        break;
                    } catch (IndexOutOfBoundsException e) {

                    }
                    if (idExists) {
                        System.out.println("Student with id " + studentId + " already exists");
                        break;
                    }
                        System.out.println("Enter student first name: ");
                        String firstName = scanner.next();

                        System.out.println("Enter student last name: ");
                        String lastName = scanner.next();

                        System.out.println("Enter student age: ");
                        int studentAge = scanner.nextInt();

                        Student student = new Student(studentId, firstName, lastName, studentAge);

                        students.add(student);
                        System.out.println("Information saved successfully");
                        break;

                case 2:
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        System.out.println("=====Student Details=====");
                        System.out.println("Student ID: " + s.id);
                        System.out.println("Student First Name: " + s.firstName);
                        System.out.println("Student Last Name: " + s.lastName);
                        System.out.println("Student Age: " + s.age);
                        System.out.println("===== End of Student Details=====");
                    }
                    break;

                case 3:
                    System.out.println("Enter student id to delete: ");
                    int deleteId = scanner.nextInt();
                    idExists = false;
                    students.remove(deleteId);
                    if (!idExists) {
                        System.out.println("Record not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}
