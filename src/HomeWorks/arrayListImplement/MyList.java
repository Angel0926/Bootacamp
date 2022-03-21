package HomeWorks.arrayListImplement;


public interface MyList extends Iterable{

    public int size();

    public boolean isEmpty();

    public boolean contains(int num);

    public int[] toArray();

    public void add(int  num);

    public void add(int index, int num);

    public void remove(int index);

    public int get(int index);

    public void set(int index,int num);

    public int indexOf(int num);

}
