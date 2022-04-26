package HomeWorks.Testsss.p;

import java.util.Iterator;
import java.util.List;

public class PersonList<P> implements Iterable<Person> {

    private final List<Person> personList;

    public PersonList(List<Person> personList) {
        this.personList = personList;
    }



    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator<Person> {

        private int index;

        @Override
        public boolean hasNext() {
            return index < personList.size();
        }

        @Override
        public Person next() {
            Person person = personList.get(index);
            index++;
            return person;
        }

        @Override
        public String toString() {
            return "PersonIterator{" +
                    "index=" + index +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "personList=" + personList +"" +
                " "+personList.toString()+
                '}';
    }
}