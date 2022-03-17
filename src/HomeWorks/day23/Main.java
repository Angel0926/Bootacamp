package HomeWorks.day23;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();




        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(4,25);
        list.add(2,85);
        list.delete(3);
        list.delete(1);
        System.out.println(list.size);
        System.out.println(list);


    }


}
