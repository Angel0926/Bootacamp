package HomeWorks.arrayListImplement;

import java.util.*;

public class ArrayList1 implements MyList {
    private int[] array;
    private int size;
    private int index;
    private static final int DEFAULT = 10;

    public ArrayList1() {
        this.array = new int[DEFAULT];
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(int num) {
        for (int i = 0; i < size; i++) {
            if (array[i] == num) {
                break;
            }
        }
        return true;
    }

    @Override
    public int[] toArray() {
        return array;
    }

    @Override
    public void add(int num) {
        if (index == array.length) {
            grow();
        }
        array[size] = num;
        index++;
        size++;
    }

    @Override
    public void add(int index, int num) {
        if (index == array.length) {
            grow();
        }
        System.arraycopy(array, index, array, index + 1, this.index - index);
        array[index] = num;
        this.index++;
        size++;
    }


    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
    }


    @Override
    public int get(int index) {
        for (int i = 0; i < size; i++) {
            if (array[i] == array[index]) {
                break;
            }
        }
        return array[index];
    }

    @Override
    public void set(int index, int num) {
        if (index == array.length) {
            grow();
        }
        array[index] = num;
        this.index++;
        size++;
    }

    @Override
    public int indexOf(int num) {
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == num) {
                break;
            }
        }
        return i;
    }

    private class ArrayListIterator implements Iterator<Integer> {
        int index=0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
         /*   if(index==0){
                System.out.println(array[index]);
            }
            index++;
      return array[index];*/
            int val=array[index];
            index++;
            return val;

        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayListIterator();
    }

    private void grow() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, index);
        array = newArray;
    }


    @Override
    public String toString() {
        return "ArrayList{" +
                "elements=" + Arrays.toString(array) +
                ", size=" + size +
                ", index=" + index +
                                       '}';
    }
}



