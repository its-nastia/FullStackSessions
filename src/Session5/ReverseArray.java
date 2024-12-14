package Session5;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int [] reversedNumbers = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers[numbers.length - 1 - i] = numbers[i];
        }
        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.println(reversedNumbers[i]);
        }
    }
}
