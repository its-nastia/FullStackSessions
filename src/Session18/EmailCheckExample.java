package Session18;

import java.util.regex.Pattern;

public class EmailCheckExample {
    public static void main(String[] args) {
        String emailPattern = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

        String validEmail = "test@mail.com";
        String invalidEmail = "test@mail";

        System.out.println("Email check for valid: " + Pattern.matches(emailPattern, validEmail));
        System.out.println("Email check for valid: " + Pattern.matches(emailPattern, invalidEmail));
    }
}