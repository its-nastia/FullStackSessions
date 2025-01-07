package Session8;

import java.util.Random;

public class NewStudent {
    static int studentCount = 0;
    int id;
    String firstName;
    String lastName;
    int age;
    String major;

    public NewStudent() {
        studentCount++;
        this.id = studentCount;
    }
    public NewStudent(String firstName, String lastName, int age, String major) {
        studentCount++;
        this.id = studentCount;
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setMajor(major);
    }

    public void setStudentId() {
        Random random = new Random();
        int generatedId = random.nextInt(100 - 1) + 1;
        this.id = generatedId;
    }

    public int getStudentId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
//        try {
//            validateAge(age);
            this.age = age;
//        } catch (InvalidAgeException e) {
//            System.out.println(e.getMessage() + " Please enter a valid age between 18 and 100.");
//        }
    }

    public int getAge() {
        return this.age;
    }

    public void setMajor(String major) {
//        try {
//            validateMajor(major);
            this.major = major;
//        } catch (InvalidMajorException e) {
//            System.out.println(e.getMessage() + " Please enter a valid major (Art, Economics, Math).");
//        }
    }

    public String getMajor() {
        return this.major;
    }

    public String toString() {
        return String.format("ID: %d, First name: %s, Last name: %s, age: %d, Major: %s",
                id,
                firstName,
                lastName,
                age,
                major);
    }

}
