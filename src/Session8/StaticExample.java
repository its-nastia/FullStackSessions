package Session8;

public class StaticExample {
    static class Config {
        static int defaultValue;

        static {
            defaultValue = 10;
        }
        public static int getDefaultValue() {
            return defaultValue;
        }
    }
    public static void main(String[] args) {
        Config c = new Config();

    }
}


