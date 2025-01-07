package Session7.SMS;

public class Student {
    int id;
    String firstName;
    String lastName;
    int age;
    String major;

    Student(int id, String firstName, String lastName, int age, String major) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    public String toString() {
        return String.format("ID: %d, First name: %s, Last name: %s, Major: %s",
                id,
                firstName,
                lastName,
                major);
    }
}