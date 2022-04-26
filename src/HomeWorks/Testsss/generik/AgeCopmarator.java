package HomeWorks.Testsss.generik;

import java.util.Comparator;

public class AgeCopmarator implements Comparator<Gencomparator> {
    @Override
    public int compare(Gencomparator o1, Gencomparator o2) {
        if(o1.age< o2.age){
            return -1;
        }
        else if(o1.age> o2.age){
            return 1;
        }
        else return 0;
    }
}
