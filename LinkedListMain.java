package com.practice14;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();

        if (linkedList.search(70) != null) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        if(linkedList.insertAfter(30,40)){
            System.out.println("element inserted successfully");
        } else {
            System.out.println("Element not found");
        }



        int deleteData = linkedList.pop();
        System.out.println();
        System.out.println("popped head element"+deleteData);
        linkedList.print();

        int popLastData = linkedList.popLast();
        System.out.println("popped last element"+deleteData);
        linkedList.print();
        System.out.println();
        System.out.println(linkedList.size);

        System.out.println();
       if (linkedList.search(70) != null) {
            System.out.println("Element is found!!");
        } else {
           System.out.println("Element Not Found!!");
       }

        System.out.println();
       if (linkedList.insertAfter( 30,40)) {
            System.out.println("Element inserted Successfully");
        } else {
            System.out.println("Element Not Found!!");
        }
        linkedList.print();
    }
}
