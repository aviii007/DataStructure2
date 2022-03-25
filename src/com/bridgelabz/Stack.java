package com.bridgelabz;

public class Stack {
    // LIFO
    LinkedList list = new LinkedList();

    // Push : Adding elements
    public void push(String data) {
        list.addFirst((String) data);
    }
    // Pop : Deleting elements
    public void pop() {
        list.deleteFirst();
    }
}
