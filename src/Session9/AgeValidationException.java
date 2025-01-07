package Session9;

// Custom Checked Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);
    }
}

public class AgeValidationException {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 100) {
            throw new InvalidAgeException("Invalid age. ");
        }
    }
}

