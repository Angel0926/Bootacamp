package HomeWorks.day26;

import java.util.*;

public class Generics<T> {

    /**
     * 1. Write a method which takes a list of any type and prints the
     * elements of the list.
     *
     * @param list
     */

    public void printListElements(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    /**
     * 2. Write a method that takes an array of T type and converts it to a list
     * of type T.
     *
     * @param arr
     * @return
     */

    public List<T> convertArrayToList(T[] arr) {

        return Arrays.asList(arr);
    }

    /**
     * 3. Write a method which takes a List of T type and Comparator of type
     * T. Return the largest value in the list.
     *
     * @param list
     * @return
     */
    public T returnLargestValue(List<T> list) {

        return Collections.max(list, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
    }

    /**
     * 4. Define a method copy(dest, src) which will copy from src to dest. src
     * and dest are lists. (use wildcards for this problem)
     * Method should work for this example`
     * List&lt;Number&gt; nums;
     * List&lt;Integer&gt; ints;
     * copy(nums, ints);
     * But not for this` copy(ints, nums);
     *
     * @param dest
     * @param src
     */
    public void copyList(List<? super T> dest, List<T> src) {
        ListIterator<? super T> di = dest.listIterator();
        ListIterator<T> si = src.listIterator();
        if (dest.size() == 0) {
            throw new IndexOutOfBoundsException("destination list can not fit");
        }
        if (dest.size() < src.size()) {
            for (int i = 0; i < dest.size(); i++) {
                di.next();
                di.set(si.next());
            }
        } else {
            for (int i = 0; i < src.size(); i++) {
                di.next();
                di.set(si.next());
            }
        }
    }
}



