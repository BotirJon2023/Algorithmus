package org.example;

public class MyLinkedList {
    private Node head;

    public void pushToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void pushToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(newNode);
    }

    public boolean pushToIndex(int index, int data) {
        Node newNode = new Node(data);
        if (index < 0 || index > (size() - 1)) {
            System.out.println("Index не валиден");
            return false;
        }
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }
        Node current = head;
        int currentIndex = 0;
        while (currentIndex < index - 1) {
            current = current.getNext();
            currentIndex++;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        return true;
    }

    public boolean removeFirst() {
        if (head == null) {
            System.out.println("List пустой");
            return false;
        }

        Node current = head;
        if (current.getNext() != null) {
            head = current.getNext();
        } else {
            head = null;
        }
        return true;

    }

    public boolean remove(int index) {
        if (index < 0 || index > (size() - 1)) {
            System.out.println("Index не валиден");
            return false;
        }
        Node current = head;
        int currentIndex = 0;
        while (currentIndex < index - 1) {
            current = current.getNext();
            currentIndex++;
        }
        current.setNext(current.getNext().getNext());
        return true;
    }

    public int size() {
        if (head == null) return 0;
        Node current = head;
        int size = 1;
        while (current.getNext() != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
