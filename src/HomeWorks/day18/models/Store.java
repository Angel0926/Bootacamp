package HomeWorks.day18.models;

import java.util.Arrays;

/**4.
 * Write a Store.java class which`
 * - - has a countOfWorkers, name, phoneNumber,
 * array of product numbers(what kind of product are in store)
 * where`
 * - - countOfWorkers must be in range 2 - 50
 * - - name must have at least 3 characters
 * - - phoneNumber must have 8 digits, also can not consist negative
 * digits
 */
public class Store {
    private int countOfWorkers;
    private String name1;
    private String phoneNumber;
    int[] productNumbers;

    public Store() {

    }

    public Store(int countOfWorkers, String name, String phoneNumber, int[] productNumbers) {
        this.countOfWorkers = countOfWorkers;
        this.name1 = name;
        this.phoneNumber = phoneNumber;
        this.productNumbers = productNumbers;
    }

    public int getCountOfWorkers() {

        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int[] getProductNumbers() {

        return productNumbers;
    }

    public void setProductNumbers(int[] productNumbers) {

        this.productNumbers = productNumbers;
    }

    @Override
    public String toString() {
        return "Store{" +
                "countOfWorkers=" + countOfWorkers +
                ", name='" + name1 + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", productNumbers=" + Arrays.toString(productNumbers) +
                '}';
    }
}
