package HomeWorks.day18.validator;

public final class PersonValidator {
    private PersonValidator() {
        super();
    }

    public static boolean isValidAge(int age) {

        return (age >= 18 && age <= 99);
    }

    public static boolean isValidFirstName(String firstName) {
        if (firstName == null || firstName.length()<3 || firstName.length()>15) {
            return false;
        }
        return true;
    }

    public static boolean isValidLastName(String lastName) {
        if (lastName == null || lastName.length()<6 || lastName.length()>20) {
            return false;
        }
        return true;
    }


    public static boolean isValidPasspordId(String passportId) {
        if (passportId == null) {
            return false;
        }
        return passportId.length() == 8 && "AN".equals(passportId.substring(0, 2)) &&
                Integer.parseInt(passportId.substring(2)) >= 0;
    }

    public static boolean isValidGender(String gender) {
        return (gender != null && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")));
    }






}



