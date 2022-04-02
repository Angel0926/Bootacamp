package HomeWorks.day26;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        list1.add(8);
        list1.add(9);
        list1.add(11);
        list1.add(15);
        list1.add(4);
        list1.add(2);

        Generics generics=new Generics();
        System.out.println(
        generics.returnLargestValue(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }}));
    }}



/**
 *   Comparator<Integer> co=new Comparator<Integer>() {
 *             @Override
 *             public int compare(Integer o1, Integer o2) {
 *                 if(o1<o2){
 *                     return -1;
 *                 }
 *                 else if(o1>o2){
 *                     return 1;
 *                 }
 *                 else return 0;
 *             }
 *         };
 */
/*
        List<Number> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(1);

        List<Integer> l2 = new LinkedList<>();
        l2.add(4);
        l2.add(7);
        l2.add(5);
        l2.add(2);

      Generics generics3=new Generics();
      generics3.copyList(l1,l2);
        System.out.println(l1);
    }
    */

