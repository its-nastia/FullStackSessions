package Session4;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        do {
            if (num < 0) {
                System.out.println("Please enter a positive number");
            } else {
                System.out.println("You entered: " + num);
            }
        } while (num < 0);

        scanner.close();
    }
}
