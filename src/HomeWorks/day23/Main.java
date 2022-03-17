package HomeWorks.day23;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);

        System.out.println(LinkedList.size);
        System.out.println(list);

       /* Iterator<Integer> iteratorLinkedList=list.iterator();
        while(iteratorLinkedList.hasNext()){
            System.out.println(iteratorLinkedList.next());
        }*/


        for (Integer integer : list) {
            System.out.println(integer);
        }


    }}
