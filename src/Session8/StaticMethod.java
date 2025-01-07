package Session8;

public class StaticMethod {
        static class MathUtil {
            public static int add(int a, int b) {
                return a + b;
            }
        }

    public static void main(String[] args) {
        System.out.println(MathUtil.add(10, 20));
    }
}
