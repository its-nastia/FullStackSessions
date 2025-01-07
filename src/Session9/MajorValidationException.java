package Session9;

// Custom Checked Exception
class InvalidMajorException extends Exception {
    public InvalidMajorException(String message) {
        super(message);
    }
}

    public class MajorValidationException {


        public static  void validateMajor(String major) throws InvalidMajorException {

            if (!major.equalsIgnoreCase("Art") &&
                    !major.equalsIgnoreCase("Economics") &&
                    !major.equalsIgnoreCase("Math")) {
                throw new InvalidMajorException("Invalid major. ");
            }
        }
    }


