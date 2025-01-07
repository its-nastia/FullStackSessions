package Session11;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisSolution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // All brackets matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a parenthesis string: ");
        String input = scanner.nextLine();
        System.out.println(new ParenthesisSolution().isValid(input));
    }
}
