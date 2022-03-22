package HomeWorks.day24;


import java.util.*;


public class Utils {

    public boolean isDuplicate(ArrayList<Integer> arrayList) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer integer : arrayList) {
            if (!(set1.add(integer))) {
                return true;
            }
        }
        return false;
    }

    public void onlyOnce(ArrayList<Integer> arrayList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : arrayList) {
            int count = 0;
            for (Integer integer1 : arrayList) {
                if (integer.equals(integer1)) {
                    count++;
                    map.put(integer, count);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public void countsDuplicateCharacters(ArrayList<Integer> arrayList) {
        int count = 0;
        Set<Integer> set1 = new HashSet<>();
        for (Integer integer : arrayList) {
            if (!(set1.add(integer))) {
                count++;
            }
        }
        System.out.println(count);
    }


    public void firstNonRepeated(ArrayList<Integer> arrayList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : arrayList) {
            int count = 0;
            for (Integer integer1 : arrayList) {
                if (integer.equals(integer1)) {
                    count++;
                    map.put(integer, count);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }


    public void lengthLongestSubstring1(ArrayList<Integer> arrayList) {
        int count = 0;
        Set<Integer> set1 = new HashSet<>();
        for (Integer integer : arrayList) {
            if (!(set1.add(integer))) {
                System.out.println(count);
            }

        }
    }

    public void lengthLongestSubstring(String text) {
        String s="ahgdjfdfdkfdnkjnkjg";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            int j = i;
            for (; j< s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break;
                } else {
                    set.add(c);
                    System.out.println(set);
                }
            }
            if (s1.length() < j - i + 1) {
                s1 = s.substring(i, j);
            }
        }
        System.out.println(s1.length());
    }
    /*
        int max = 0;
        Map<Integer, StringBuilder> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            StringBuilder t = new StringBuilder();
            t.append(text.charAt(0));
            for (int j = i + 1; j < text.length(); j++) {

                if (text.charAt(i) != t.charAt(j)) {
                    t.append(text.charAt(j));
                    count++;
                } else {
                    map.put(count, t);
                }
            }
        }
        for (Map.Entry<Integer, StringBuilder> entry : map.entrySet()) {
            if (entry.getKey() == max) {
                System.out.println(entry.getValue());
            }
        }
    }
*/
}


