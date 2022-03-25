package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Stacks and Queues Program");
        System.out.println("STACK");
        Stack stack = new Stack();
        stack.push("ashvini");
        stack.push("is");
        stack.push("name");
        stack.push("my");

        stack.pop(); //will remove is
        stack.pop(); //will remove name
        stack.pop(); //will remove my
        System.out.println("----------------");

        System.out.println("QUEUE");
        Queue queue = new Queue();
        queue.enqueue("my");
        queue.enqueue("name");
        queue.enqueue("is");
        queue.enqueue("ashvini");
    }
}
