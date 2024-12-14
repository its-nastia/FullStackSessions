package Session4;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num+"*"+i+"= "+i*num);
        }
        scanner.close();
    }
}
