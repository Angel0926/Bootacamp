package HomeWorks.day26;
/**5. Create Pair interface with 2 generic types and with methods getKey(),
 getValue(). Create DefaultPair class with 2 generic types which
 implements Pair interace. DefaultPair has following fields` key, value.*/

public class DefaultPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

class Test {
    public static void main(String[] args) {

        DefaultPair<Integer, String> pair = new DefaultPair<>();

        pair.setKey(20);
        pair.setValue("A");

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

    }
}
