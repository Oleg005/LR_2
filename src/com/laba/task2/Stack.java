package com.laba.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Node {
    Node next;
    Integer data;

    public Node() { this(0, null); }
    public Node(Integer data) { this(data, null); }
    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Stack implements Iterable<Integer> {
    private Node head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(Integer data) {
        this.head = new Node(data, head);
        this.size++;
    }
    public Integer pop() {
        if(isEmpty())
            throw new NoSuchElementException();
        Integer data = this.head.data;
        if(isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        this.head = this.head.next;
        this.size--;
        return data;
    }

    public boolean isEmpty() { return this.size == 0; }
    public int getSize() { return this.size; }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int count = 0;
            private Node current = head;
            public boolean hasNext() {
                return count < size;
            }
            public Integer next() {
                Integer data = current.data;
                current = current.next;
                count++;
                return data;
            }
        };
    }
}