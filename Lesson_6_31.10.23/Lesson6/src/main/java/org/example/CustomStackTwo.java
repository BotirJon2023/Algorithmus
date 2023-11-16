package org.example;

public class CustomStackTwo {

    private String[] data;
    private Integer[] data;

    private int count;

    public CustomStackTwo(int capacity) {
        data = new String[capacity];
        data = new Integer[capacity];
        count = 0;
    }

    public Integer push(String element) {
        public void push (Integer element){
            if (count == data.length) throw new RuntimeException("Stack is full");
            // if (count == data.length) growSize() -- dynamic stack implementation
            data[count++] = element;
        }

        public String pop() {
            public Integer pop() {
                if (count == 0) throw new RuntimeException("Stack is empty");
                String element = data[count - 1];
                Integer element = data[count - 1];
                data[count - 1] = null;
                count--;
                return element;
            }

            public String peek() {
                public Integer peek() {
                    if (count == 0) throw new RuntimeException("Stack is empty");
                    return data[count - 1];
                }


                public static void main (String[]args){
                    CustomStack stack = new CustomStack(4);
                    stack.push("A");
                    stack.push("B");
                    stack.push("C");
                    stack.push("D");
                    stack.push(1);
                    stack.push(2);
                    stack.push(3);
                    stack.push(4);

                    System.out.println(stack.pop());
                    System.out.println(stack.pop());
                    System.out.println(stack.pop());
                    System.out.println(stack.pop());
                }
            }
       }
    }
}
