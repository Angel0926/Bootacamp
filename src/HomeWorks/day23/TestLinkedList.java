package HomeWorks.day23;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);

        System.out.println(list);
        System.out.println(list.get(2));

     /*  Iterator<Integer> iteratorLinkedList=list.iterator();
        while(iteratorLinkedList.hasNext()){
            System.out.println(iteratorLinkedList.next());
        }*/


        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
