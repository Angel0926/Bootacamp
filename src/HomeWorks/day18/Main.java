package HomeWorks.day18;

import HomeWorks.day18.models.Person;
import HomeWorks.day18.models.Store;
import HomeWorks.day18.models.Triangle;

import java.util.Scanner;

import static HomeWorks.day18.validator.PersonValidator.*;
import static HomeWorks.day18.validator.StoreValidator.*;
import static HomeWorks.day18.validator.TriangleValidator.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * 1
         */
        Person person = new Person("Ani", "Grig", "AN058475", 25, "Female");
        System.out.println(person.display());

        /**
         * 2
         */

        System.out.print("Input firstName: ");
        String firstName = scanner.nextLine();
        if (isValidFirstName(firstName)) {
            person.setFirstName(firstName);
        } else {
            System.out.println("firstName must be in range 3 to 15");
        }


        System.out.print("Input lastName: ");
        String lastName = scanner.nextLine();
        if (isValidLastName(lastName)) {
            person.setLastName(lastName);
        } else {
            System.out.println("lastName must be in range 6 to 20");
        }

        System.out.print("Input age: ");
        int age = scanner.nextInt();
        if (isValidAge(age)) {
            person.setAge(age);
        } else {
            System.out.println("age must be in range 18 - 99");
        }

        System.out.print("Input passportId name: ");
        String passportId = scanner.next();
        if (isValidPasspordId(passportId)) {
            person.setPassportId(passportId);
        } else {
            System.out.println("passportId must be start with “AN” and contain 6 digits with length 8");
        }


        System.out.print("Input gender MALE OT FEMALE: ");
        String gender = scanner.next();
        if (isValidGender(gender)) {
            person.setGender(gender);
        } else {
            System.out.println("gender must be male or female(compareToIgnoreCase())");
        }


        System.out.println(person.display());

/**
 * 3
 */
        Triangle triangle1 = new Triangle();

        System.out.print("Input side: ");
        double sideA = scanner.nextDouble();
        if (isValidSide(sideA)) {
            triangle1.setSideA(sideA);
        } else {
            System.out.println("sideA must be in range 1 - 20");
        }

        System.out.print("Input sideB: ");
        double sideB = scanner.nextDouble();
        if (isValidSide(sideB)) {
            triangle1.setSideB(sideB);
        } else {
            System.out.println("sideB must be in range 1 - 20");
        }

        System.out.print("Input sideC: ");
        double sideC = scanner.nextDouble();
        if (isValidSide(sideC)) {
            triangle1.setSideC(sideC);
        } else {
            System.out.println("sideC must be in range 1 - 20");
        }

        if (isTriangleValid(sideA, sideB, sideC)) {
            System.out.println(countPerimeter(triangle1));
        }

        if (isTriangleRight(sideA, sideB, sideC)) {
            countSquare(triangle1);
        } else countPerimeter(triangle1);

        System.out.println(triangle1.toString());

        /**
         *4
         */
        Store store = new Store();

        System.out.print("input count  workers: ");
        int countOfWorkers = scanner.nextInt();
        if (isValidCountOfWorkers(countOfWorkers)) {
            store.setCountOfWorkers(countOfWorkers);
        } else {
            System.out.println("countOfWorkers must be in range 2 - 50");
        }

        System.out.print("input name: ");
        String name1 = scanner.next();
        if (isValidName1(name1)) {
            store.setName1(name1);
        } else {
            System.out.println("name must have at least 3 characters");
        }


        System.out.print("input  phoneNumber: ");
        String phoneNumber = scanner.next();
        if (isValidPhoneName(phoneNumber)) {
            store.setPhoneNumber(phoneNumber);
        } else {
            System.out.println("phoneNumber must have 8 digits, also can not consist negative digits");
        }

        System.out.print("input  productNumber: ");
        int[] productNumber = new int[10];
        for (int i = 0; i < 10; i++) {
            int p = scanner.nextInt();
            productNumber[i] = p;
            store.setProductNumbers(productNumber);
        }


        System.out.println(store.toString());
    }


}
