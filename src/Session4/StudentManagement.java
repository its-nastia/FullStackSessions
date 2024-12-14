package Session4;

import java.util.Scanner;

public class StudentManagement {
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
        Student[] students = new Student[5];
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
                    try {
                        System.out.println("Enter student ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        boolean idExists = false;
                        for (int i =0; i < studentCount; i++) {
                            Student s = students[i];
                            if (students[i] != null && s.id == id) {
                                idExists = true;
                                break;
                            }
                        }
                        if (idExists) {
                            System.out.println("Student ID already exists. Please enter a unique ID.");
                        } else {
                            System.out.println("Enter student first name: ");
                            String firstName = scanner.nextLine();

                            System.out.println("Enter student last name: ");
                            String lastName = scanner.nextLine();

                            System.out.println("Enter student age: ");
                            int age = scanner.nextInt();

                            Student student = new Student(id, firstName, lastName, age);
                            students[studentCount] = student;
                            studentCount++;
                            System.out.println("Information saved successfully.");
                        }

                    } catch (Exception e){
                    System.out.println("An error occurred while adding the student: " + e.getMessage());
                }

                    break;
                case 2:
                    if (studentCount == 0) {
                        System.out.println("The student list is empty.");
                    } else {

                        for (int i = 0; i < studentCount; i++) {
                            Student s = students[i];
                            System.out.println("=====Student Details=====");
                            System.out.println("Student ID: " + s.id);
                            System.out.println("Student First Name: " + s.firstName);
                            System.out.println("Student Last Name: " + s.lastName);
                            System.out.println("Student Age: " + s.age);
                            System.out.println("===== End of Student Details=====");
                        }
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Enter student id to delete: ");
                        int studentId = scanner.nextInt();
                        boolean idExists = false;
                        for (int i = 0; i < studentCount; i++) {
                            if (students[i] != null && students[i].id == studentId) {
                                students[i] = null;
                                System.out.println("Student deleted successfully.");
                                idExists = true;
                                break;
                            }
                        }
                        if (!idExists) {
                            System.out.println("Record not found.");
                        }
                    } catch (Exception e) {
                        System.out.println("An error occurred while deleting the student: " + e.getMessage());
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
