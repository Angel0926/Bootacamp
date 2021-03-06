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



    /*
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
*/


    public int lengthLongestSubstring(String s) {
      HashMap<Character, Integer> map = new HashMap<>();
        int maximum_length = 0;
        int start = 0;
        for(int end = 0; end < s.length(); end++)
        {
            if(map.containsKey(s.charAt(end)))
            {
                start = Math.max(start, map.get(s.charAt(end)) + 1);
            }
            map.put(s.charAt(end), end);
            maximum_length = Math.max(maximum_length, end-start + 1);
        }
        return maximum_length;
    }
    }


