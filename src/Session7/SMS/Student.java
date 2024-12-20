package Session7.SMS;

public class Student {
    int id;
    String firstName;
    String lastName;
    int age;
    String major;

    public Student(int id, String firstName, String lastName, int age, String major) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    public String toString() {
    return String.format("ID: %d, First Name: %s, Last Name: %s, Major: %s",
            this.id,
            this.firstName,
            this.lastName,
            this.major);
    }
}