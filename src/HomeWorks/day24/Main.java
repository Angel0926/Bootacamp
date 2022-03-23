package HomeWorks.day24;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(32);
        arr.add(18);
        arr.add(44);
        arr.add(25);
        arr.add(52);
        arr.add(44);
        arr.add(42);
        arr.add(44);

        Utils utils = new Utils();

       // System.out.println(utils.isDuplicate(arr));
//        utils.onlyOnce(arr);
//        utils.countsDuplicateCharacters(arr);
//        utils.firstNonRepeated(arr);
        System.out.println(utils.lengthLongestSubstring("abcdba"));

    }
}
