package Session18;

import java.util.regex.Pattern;

public class RegExExamples {
    public static void main(String[] args) {
        String ssnPattern = "^(?!000|666|9..)\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";

        String validSsn = "123-45-6789";
        String invalidSsn = "123-45-67890";

        System.out.println("SSN check result for valid value: " + Pattern.matches(ssnPattern, validSsn));
        System.out.println("SSN check result for invalid value: " + Pattern.matches(ssnPattern, invalidSsn));
    }
}
