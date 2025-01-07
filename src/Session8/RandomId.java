package Session8;

import java.util.Random;

public class RandomId {
    public static void main(String[] args) {
        Random random = new Random();
        int generatedId = random.nextInt(100 - 1) + 1;
        System.out.println("Generated ID: " + generatedId);
    }
}
