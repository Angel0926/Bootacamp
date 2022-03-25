package HomeWorks.day26;

import java.util.LinkedList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(8);
        list.add(12);

        Generics<Integer> generics = new Generics<>();

        System.out.println(generics.returnLargestValue(list));

        List<String> list1 = new LinkedList<>();
        list1.add("Armenia");
        list1.add("Russia");
        list1.add("Germany");
        Generics<String> generics1 = new Generics<>();
        System.out.println(generics1.returnLargestValue(list1));


        List<Number> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(1);

        List<Integer> l2 = new LinkedList<>();
        l2.add(4);
        l2.add(7);
        l2.add(5);
        l2.add(2);

        generics.copyList(l1, l2);
        System.out.println(l1);
    }
}

