package com.mac286.queues;

import com.mac286.arrays.OurVector;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTester {
    public static void main(String[] args) {
        //Queue in Java is an interface, therefore you need an
        //object of an implenting class of that interface.
        //Queue<Integer> Q = new LinkedList<>();
        //OurQueue<Integer> Q = new OurQueue<>();
        iOurQueue<Integer> Q = new OurVector<>();
        Q.add(-1);
        Q.add(-5);
        Q.add(-3);
        System.out.println("Q: " + Q);
        System.out.println("Removing: " + Q.remove());
        System.out.println("Q: " + Q);
    }
}
