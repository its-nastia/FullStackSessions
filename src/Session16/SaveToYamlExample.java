//package Session16;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//public class SaveToYamlExample {
//    public static void main(String[] args) {
//        List<Student> studentList = List.of(
//                new Student(1, "John", 20, 3.5),
//                new Student(2, "Jane", 21, 3.6),
//                new Student(3, "Jim", 22, 3.7)
//        );
//        saveToYaml(studentList);
//    }
//    public static void saveToYaml(List<Student> students) {
//        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
//        ObjectMapper
//
//        try {
//            mapper.writeValue(new File("student.yaml"), students);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
