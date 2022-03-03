package HomeWorks.day12;

import java.util.Random;

public class Day12 {
    Random random = new Random();

    public static void main(String[] args) {
        Day12 d = new Day12();
    }

    /**
     * 1.Print all elements of the array with even indices (that is, A [0], A
     * [2], A [4]...)
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     * Example ` Input` 1 2 3 4 5
     * Output` 1 3 5
     */

    public static void arrEvenIndex(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 15);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * 2
     * Print all even numbered items in the list.
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     * Example ` Input` 1 2 3 4 5 10
     * Output` 2 4 10
     */

    public static void arrEvenElement(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 15);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * 3. Find the number of positive elements in the given array.
     * Example` Input` 1 -1 2 3 -8
     * Output 1 2 3
     */


    public void positiveElement(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * 4. A list of numbers is given. Print all the elements of the list that are
     * larger than the previous element.
     * Example` Input ` 1 5 2 4 3 Output` 5 4
     */

    public void allElementsOfList(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * 5
     * An array of numbers is given. If it has two adjacent(հարևան)
     * elements of the same sign, print these numbers. If there are no
     * adjacent elements of the same character, do not print anything. If there
     * are several such pairs of neighbors, print the first pair.
     * Example` Input` -1 2 3 -1 -2
     * Output` 2 3
     */

    public void adjacentElement(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > 0 && array[i - 1] > 0) {
                System.out.println(array[i - 1] + " " + array[i]);
                break;
            }
            if (array[i] < 0 && array[i - 1] < 0) {
                System.out.println(array[i - 1] + " " + array[i]);
                break;
            }
        }
    }


    /**
     * 6
     * An array of numbers is given. Print the value of the largest element in
     * the array, and then the index of that element in the array. If there are
     * several largest elements, print the index of the first of them.
     * Example` Input` 1 2 3 2 1
     * Output` The largest is 3 index is 2
     */

    public void maxElement(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        int k = 0;
        for (int i = 1; i < array.length; i++)
            if (array[i] > max) {
                max = array[i];
                k = i;
            }
        System.out.println(max + " " + k);
    }

    /**
     * 7.Print the value of the smallest of all positive elements in the list. It is
     * known that the list contains at least one positive element, and the
     * absolute value of all elements of the list does not exceed 1000.
     * Example ` Input ` 5 -4 3 -2 1
     * Output ` 1
     */


    public void minElement(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2000) - 1000;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                min = array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {

            if (min > array[i] && array[i] > 0) {
                min = array[i];
            }
        }
        System.out.println(min);

    }

    /**
     * 8.You are given a list sorted by non-decreasing elements in it. Determine
     * how many different elements are in it.
     * Example ` Input ` 1 2 2 3 3 3
     * Output ` 3
     */

    public void differentElement() {
        int[] array = new int[]{6, 6, 7, 1, 1, 1, 9};
        int count = 1;
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j + 1] != array[j]) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * 9.Print the elements of the given list in reverse order without changing
     * the list itself.
     * Example ` Input ` 1 2 3 4 5
     * Output ` 5 4 3 2 1
     */
    public void reverseArray() {
        int[] array = new int[]{6, 5, 7, 4, 1, 1, 9};
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
    }

    /**
     * 10.Rearrange the elements of this array in reverse order, then print the
     * elements of the resulting array.
     * This task differs from the previous one in that you need to change the
     * values of the elements of the array itself, swapping A [0] with A [n-1], A
     * [1] with A [n-2], and then display the elements of the array in a row.
     * Example ` Input ` 1 2 3 4 5
     * Output ` 5 4 3 2 1
     */


    public void rerrangeElemArray() {
        int[] array = new int[]{6, 5, 7, 4, 1, 1, 9};
        int i, t;
        for (i = 0; i < array.length / 2; i++) {
            t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }


    /**
     * 11
     * Rearrange the adjacent elements of the array (A [0] with A [1], A [2]
     * with A [3], etc.). If there is an odd number of elements, then the last
     * element remains in its place.
     * <p>
     * Example ` Input ` 1 2 3 4 5
     * Output ` 2 1 4 3 5
     */

    public void rerrangeAdjancedElemArray() {
        int[] array = new int[]{6, 5, 7, 4, 8, 1, 9};
        int i, t;
        for (i = 0; i < array.length - 1; i += 2) {
            t = array[i];
            array[i] = array[i + 1];
            array[i + 1] = t;
        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }


    /**
     * 12.
     * Cycle the elements of the array to the right (A [0] goes to A [1], A [1]
     * to A [2], ..., the last element goes to A [0]).
     * Example ` Input ` 1 2 3 4 5
     * Output ` 5 1 2 3 4
     */


    public void cycleElemArray() {
        int[] array = new int[]{6, 5, 7, 4, 8, 1, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            int j, last;
            last = array[array.length - 1];

            for (j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
            break;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    /**
     * 13.
     * 13.In the list, all items are different. Swap the minimum and maximum
     * elements of this list.
     * Example ` Input ` 3 2 1 4 5
     * Output ` 3 2 5 4 1
     */

    public static void swapMinMax(int[] arr) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] > arr[minIndex]) {
                minIndex = i;
            }
        }
        if (minIndex != maxIndex) {
            int temp = arr[minIndex];
            arr[minIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }


    /**
     * 14.You are given an array of numbers and the index of an element in the
     * array. Index is k. Remove the element with index k from the list by
     * moving all elements to the right of the element with index k to the left.
     * The program should shift directly in the array, and not do it when
     * displaying elements. Also, you cannot use an additional array.
     * At least decrement size of array, and print array;
     * Example` Input` 1 2 3 4 5 Output` 1 2 4 5
     * 2
     */

    public void removeElement(int k) {
        int[] array = new int[]{6, 5, 7, 4, 8, 1, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int size = array.length - 1;
        for (int i = k; i < size; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }


    /**
     * 15
     * 15.A list is given. Print those elements of it that appear in the list
     * only once. Items should be displayed in the order in which they
     * appear in the list.
     * Example` Input ` 1 2 2 3 3 3
     * Output ` 1
     */
    public static void printElement(int[] arr) {
        int len = arr.length;
        boolean isUnique;
        for (int i = 0; i < len; i++) {
            isUnique = true;

            for (int j = 0; j < len; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }

            }
            if (isUnique) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    /**
     * 16.An array of integers is given. It is required to “compress” it by moving
     * all non-zero elements to the left side of the array without changing their
     * order, and all zeros to the right side. The order of nonzero elements
     * <p>
     * cannot be changed, an additional list cannot be used, the task must be
     * completed in one pass through the array. Print the resulting array.
     * Example` Input ` 1 0 3 0 5
     * Output ` 1 3 5 0 0
     */
    public static void shiftZeros(int[] arr) {
        int index = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }

        }
    }
}



