package HomeWorks.day23;

import java.util.Iterator;

public class LinkedList implements List {

    public static int size = 0;
    public Node head;


    static class Node {
        public int val;
        public Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {

            this.val = val;
        }

        public Node(Node next) {
            this.next = next;
        }

        public Node() {

        }

        @Override
        public String toString() {
            return val + "->" + next;
        }
    }


    public  class IteratorLinkedList implements Iterator<Integer> {
        private int index=0;
        Node newNode = head;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next(){
            int ref = newNode.val;
            newNode = newNode.next;
            index++;
            return ref;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorLinkedList();
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean izEmpty() {
        return size() == 0;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        size++;
        return tempNode.val;
    }

    @Override
    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        size++;
    }


    @Override
    public void add(int index, int val) {
        Node last = head;
        for (int i = 0; i < index - 1; i++) {
            last = last.next;
        }
        if (index == 0) {
            head = new Node(val, last);

        } else last.next = new Node(val, last.next);
        size++;
    }

    @Override
    public void delete(int index) {
        Node node = head;
        if (index > size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            head = node.next;
        }
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }

        node.next = node.next.next;

        size--;
    }

    @Override

    public String toString() {
        Node node = head;
        return "[" + node.toString() + "]";

    }

}
