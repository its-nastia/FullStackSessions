package Session5;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to search: ");
        int searchNumber = scanner.nextInt();
        int[] numbers = {24, 54, 67, 54, 32, 33, 47, 39};

        boolean numberFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                numberFound = true;
                break;
            }
        }
        if (numberFound) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
        scanner.close();
    }
}
