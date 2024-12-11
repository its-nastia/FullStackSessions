package Session3;

import java.util.Scanner;

public class StudentMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        String firstName = "";
        String lastName = "";
        int age = 0;

         while(true) {
             System.out.println("==== Student Menu ====");
             System.out.println("1. Enter student details");
             System.out.println("2. Display student details");
             System.out.println("3. Reset student details");
             System.out.println("4. Exit");

             System.out.println("Enter your choice: ");

             int choice = scanner.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("Enter student ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Enter student first name: ");
                        firstName = scanner.nextLine();

                        System.out.println("Enter student last name: ");
                        lastName = scanner.nextLine();

                        System.out.println("Enter student age: ");
                        age = scanner.nextInt();

                        break;
                    case 2:
                        System.out.println("==== Student Details ====");
                        System.out.println("Student ID: " + id);
                        System.out.println("Student First Name: " + firstName);
                        System.out.println("Student Last Name: " + lastName);
                        System.out.println("Student Age: " + age);
                        break;
                    case 3:
                        System.out.println("Resetting student data...");
                        id = 0;
                        firstName = "";
                        lastName = "";
                        age = 0;
                        System.out.println("Reset complete!");
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
