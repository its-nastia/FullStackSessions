package Session7.SMS;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while(true) {
            System.out.println("==== Student Menu ====");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Delete student details");
            System.out.println("4. Edit student details");
            System.out.println("5. Exit");
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

                    System.out.println("Enter student major: ");
                    String major = scanner.next();

                    Student student = new Student(studentId, firstName, lastName, studentAge, major);

                    students.add(student);
                    System.out.println("Information saved successfully: " + student.toString());
                    break;

                case 2:
                    System.out.println("--------------------------------------------");
                    System.out.println("Student ID\tFirst Name\t\t\tLast Name\t\t\tAge\t\tMajor");
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        System.out.printf("%-10d %-20s %-20s %-5d %-20s %n", s.id, s.firstName, s.lastName, s.age, s.major);
                    }
                    System.out.println("--------------------------------------------");
                    break;

                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();

                    idExists = false;
                    students.remove(id-1);
                    System.out.println("Student deleted successfully");
                    if (!idExists) {
                        System.out.println("Student with id " + id + " does not exist");
                    }
                    break;
                case 4:
                    //define student to edit
                    //search for student
                    //found not found
                    //if found, edit

                    System.out.println("Enter student ID to edit: ");
                    int idToEdit = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;
                    for (Student s : students) {
                        if (s.id == idToEdit) {
                            System.out.println("Enter new first name: ");
                            s.firstName = scanner.nextLine();

                            System.out.println("Enter new last name: ");
                            s.lastName = scanner.nextLine();

                            System.out.println("Enter new age: ");
                            s.age = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Enter new major: ");
                            s.major = scanner.nextLine();

                            System.out.println("Student updated.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID:" + idToEdit + " not found.");
                    }
                    break;
                case 5:
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
