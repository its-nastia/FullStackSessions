package Session16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveToCsvExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Rocket", 7, 4));
        studentList.add(new Student(2, "Luna", 9, 3));
        studentList.add(new Student(3, "Sol", 9, 4));

        saveStudentToCsv(studentList);
//        for (Student s: loadStudentFromCsv()) {
//            System.out.println(s);
//        }
    }

    public static void saveStudentToCsv(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter((new FileWriter("student.csv")))) {
            for (Student s: students) {
                bw.write(s.toCsv());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Student> loadStudentFromCsv() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("student.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                students.add(Student.fromCsv(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
