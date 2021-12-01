package com.laba.task2;

public class Task2 {
    public static void main(String[] args){
        Stack stack = new Stack();

        System.out.println("push 1");
        stack.push(1);
        System.out.println("push 2");
        stack.push(2);
        System.out.println("push 3");
        stack.push(3);
        System.out.println("push 4");
        stack.push(4);
        System.out.println("push 5");
        stack.push(5);

        System.out.print("Stack: ");
        for(Integer i:stack)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("pop: " + stack.pop() + " ");
        System.out.println("pop: " + stack.pop() + " ");
        System.out.println("pop: " + stack.pop() + " ");

        System.out.print("Stack: ");
        for(Integer i : stack)
            System.out.print(i + " ");

        System.out.println("\nStack: ");
        stack.forEach(System.out::println);
    }

}
