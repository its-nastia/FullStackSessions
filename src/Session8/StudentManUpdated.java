package Session8;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManUpdated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NewStudent> students = new ArrayList<>();

        while (true) {
            System.out.println("==== Student Menu ====");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Delete student details");
            System.out.println("4. Edit student details");
            System.out.println("5. Save to JSON file");
            System.out.println("6. Load from JSON file");
            System.out.println("7. Exit");
            System.out.println("======================");
            System.out.println("Enter your choice: ");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    boolean idExists = false;
                    NewStudent student = new NewStudent();

                    System.out.println("Student ID generation...");

                    student.setStudentId();

                    scanner.nextLine();
                    System.out.println("New student ID: "+student.getStudentId());
                    try {
                        students.get(student.id);
                        idExists = true;
                        break;
                    } catch (IndexOutOfBoundsException e) {

                    }
                    if (idExists) {
                        System.out.println("Student with id " + student.id + " already exists");
                        break;
                    }
                    System.out.println("Enter student first name: ");
                    String fName = scanner.next();
                    student.setFirstName(fName);

                    System.out.println("Enter student last name: ");
                    String lName = scanner.next();
                    student.setLastName(lName);

                    System.out.println("Enter student age: ");
                    int stAge = scanner.nextInt();
                    try {
                        student.setAge(stAge);
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid age. " + e.getMessage());
                        break;
                    }

                    System.out.println("Enter student major:");
                    String major = scanner.nextLine();
                    try {
                        student.setMajor(major);
                    } catch (Exception e) {
                        System.out.println("Invalid age. " + e.getMessage());
                        break;
                    }

                    students.add(student);
                    System.out.println("Information saved successfully: " + student.toString());
                    break;

                case 2:
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("Student ID\tFirst Name\t\t\tLast Name\t\t\tAge\t\tMajor");
                    for (int i = 0; i < students.size(); i++) {
                        NewStudent s = students.get(i);
                        System.out.printf("%-10d %-20s %-20s %-5d %-20s %n", s.id, s.firstName, s.lastName, s.age, s.major);
                    }
                    System.out.println("------------------------------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();

                    idExists = false;
                    students.remove(id - 1);
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
                    for (NewStudent s : students) {
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
                    System.out.println("Saving to JSON file...");
                    System.out.println("Saving to JSON file...");
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    try (FileWriter writer = new FileWriter("students.json")) {
                        gson.toJson(students, writer);
                        System.out.println("Data saved to students.json");
                    } catch (IOException e) {
                        System.out.println("An error occurred while saving data to JSON file: " + e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Loading from JSON file...");
                    System.out.println("Loading from JSON file...");
                    try (FileReader reader = new FileReader("students.json")) {
                        Gson loadGson = new Gson();
                        Type studentListType = new TypeToken<ArrayList<NewStudent>>(){}.getType();
                        students = loadGson.fromJson(reader, studentListType);
                        System.out.println("Data loaded from students.json");
                    } catch (IOException e) {
                        System.out.println("An error occurred while loading data from JSON file: " + e.getMessage());
                    }
                    break;
                case 7:
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

