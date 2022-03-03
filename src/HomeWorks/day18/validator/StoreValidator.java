package HomeWorks.day18.validator;

public final  class StoreValidator {
 private StoreValidator() {
        super();
    }

    public static boolean isValidCountOfWorkers(int countOfWorkers) {
        return countOfWorkers >= 2 && countOfWorkers <= 50;
    }

    public static boolean isValidName1(String name1) {
     if(name1==null  ||name1.length()<3){
         return false;
     }
     return  true;
    }

    public static boolean isValidPhoneName(String phoneNumber) {
        return phoneNumber != null && phoneNumber.length() == 8 &&
                phoneNumber.matches("[0-9]+") &&
                Integer.parseInt(phoneNumber) >= 0;
    }


    }



