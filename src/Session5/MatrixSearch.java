package Session5;

import java.util.Random;
import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        int search = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == search) {
                    matrix[i][j] = -10;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
