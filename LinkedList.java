package com.practice14;

public class LinkedList<E extends Comparable<E>> {

    Node<E> head;
    Node<E> tail;

    int size;

    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        }else{
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }


    public E pop() {
        Node<E> temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public E popLast() {
        Node<E> temp = head;
        Node<E> prevTemp = null;

        while (temp.next != null) {
            prevTemp = temp;
            temp = temp.next;
        }
        prevTemp.next = null;
        tail = prevTemp;
        return temp.data;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }


    public Node<E> search(E data) {
        Node<E> temp = head;
        Node<E> searchNode = null;
        while (temp != null) {
            if (temp.data.compareTo(data) == 0) {

            }
            temp = temp.next;
        }
        return searchNode;
    }

    public boolean insertAfter(E searchData, E insertData) {
        Node<E> newNode = new Node<>(insertData);
        Node<E> searchNode = search(searchData);
        newNode.next = searchNode.next;
        searchNode.next = newNode;
        boolean flag = false;
        if(searchNode!= null) {
            newNode.next = searchNode.next;
            searchNode.next = newNode;
            flag = true;
        }
        return flag;
    }
}
