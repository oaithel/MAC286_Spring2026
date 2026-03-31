package com.mac286.linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTester {
    public static void main(String[] args) {
        //LinkedList<Integer> Ar = new LinkedList<>();
        OurLinkedList<Integer> Ar = new OurLinkedList<>();
        //LinkedList add() adds at the back, remove/pop/poll removes the first
        //peek returns the first.
        Ar.add(-1);
        Ar.add(-3);
        System.out.println("Ar: " + Ar);
        Ar.add(-5);
        System.out.println("Ar: " + Ar);
        System.out.println("removing: " + Ar.remove()); //removes the first, implements the queue
        System.out.println("Ar: " + Ar);
        System.out.println("Peek: " + Ar.peek());
        System.out.println("pop: " + Ar.poll());
        Ar.add(-1);
        Ar.add(-7);
        System.out.println("Ar: " + Ar);
        Ar.add(-13, 2);
        System.out.println("Ar: " + Ar);

    }
}
