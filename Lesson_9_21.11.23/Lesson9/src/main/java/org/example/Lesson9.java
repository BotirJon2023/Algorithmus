package org.example;

public class Lesson9 {

    private int[] data;
    private int head;
    private int tail;

    public void CustomQueue(int captivity) {

        data = new int[captivity];
        head = -1;
        tail = -1;

    }

    public void enqueue(int element) {
        if (++tail >= data.length) tail = 0;
        if (head == -1) head = 0;
        if (tail > head) throw new RuntimeException("Queue is full");
        data[tail] = element;

    }

    public int dequeue() {
        if (head == -1) throw new RuntimeException("Queue is empty");
        int result = data[head];
        if (++head >= data.length) head = 0;
        if (head > tail) {
            head = -1;
            tail = -1;
        }
        return result;
    }

    public boolean isEmpty() {
        return head == -1;

    }
}
