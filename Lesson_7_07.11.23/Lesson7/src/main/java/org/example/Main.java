package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.pushToHead(10);
        list.pushToHead(15);
        list.pushToHead(20);
        list.pushToTail(25);
        System.out.println("Size = "+list.size());
        list.pushToIndex(2, 11);
        list.print();

        list.removeFirst();
        list.print();

        list.remove(2);
        list.print();
    }

    public int size() {
        Node head;
        head = null;
        if(head == null) return 0;
        Node current = head;
        int size = 1;
        while (current.getNext()!=null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    void print(Node head) {
        Node current = head;
        while (current!=null) {
            System.out.print(current.getData()+" ");
            current = current.getNext();
        }
        System.out.println();
    }
}

