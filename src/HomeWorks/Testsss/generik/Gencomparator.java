package HomeWorks.Testsss.generik;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Gencomparator  {

    int age;
    public Gencomparator() {

    }
    public Gencomparator(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        List<Gencomparator> list = new LinkedList<Gencomparator>();
Gencomparator g1=new Gencomparator(80);
Gencomparator g2=new Gencomparator(70);
Gencomparator g3=new Gencomparator(90);
        list.add(g1);
        list.add(g2);
        list.add(g3);
        Collections.sort(list, new AgeCopmarator());
        for (Gencomparator o : list) {
            System.out.println(o);
        }
    }


    @Override
    public String toString() {
        return "Gencomparator{" +
                " age=" + age +
                '}';
    }
}
