package Session5;

public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 5, 4},
                {9, 3, 5},
                {3, 7, 5}};
        printMatrix(matrix);
        printMatrixSum(matrix);
        printVerticalSum(matrix);

    }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        public static void printMatrixSum(int[][] matrix) {
            int sum = 0;
            for (int[] row : matrix) {
                for (int element : row) {
                    sum += element;
                }
            }
            System.out.println("Sum of all elements in the matrix: " + sum);
        }

        public static void printVerticalSum(int[][] matrix) {
            int[] sum = new int[matrix[0].length];
            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    sum[i] += matrix[j][i];
                }
                System.out.println("Sum of column " + i + ": " + sum[i]);
            }
        }

}
