package HomeWorks.arrayListImplement;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList1 arrayList = new ArrayList1();

        arrayList.add(25);
        arrayList.add(32);
        arrayList.add(27);
        arrayList.add(38);
        arrayList.add(45);
        arrayList.add(69);
        arrayList.add(74);
        arrayList.add(52);
        arrayList.add(74);
        arrayList.add(84);
        arrayList.add(64);

        /*
Iterator<Integer> iterator= arrayList.iterator();
while ((iterator.hasNext())){
    System.out.println(iterator.next());
}*/

        for (Integer integer : (Iterable<Integer>) arrayList) {
            System.out.println(integer);
        }

    }
}
