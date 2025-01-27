package Session15;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (numbers[mid] == target) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
    }
}
