package HomeWorks.Testsss;

import java.util.*;

public class queue  implements  Comparable{
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        maxPriorityQueue.add(25);
        maxPriorityQueue.add(32);
        maxPriorityQueue.add(8);
        maxPriorityQueue.add(28);
        maxPriorityQueue.add(10);
        System.out.println(maxPriorityQueue);
        System.out.println(maxPriorityQueue.peek());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
