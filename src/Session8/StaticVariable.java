package Session8;

public class StaticVariable {
    static class Student {
        static int studentCount = 0;
         public Student () {
            studentCount++;
         }
         public static void showCount() {
             System.out.println("Total students: " + studentCount);
         }
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student.showCount();
    }
}
