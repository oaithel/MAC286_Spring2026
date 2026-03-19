package com.mac286.queues;

import java.util.Arrays;
import java.util.EmptyStackException;

public interface iOurQueue <T>{
    int size();
    boolean isEmpty();
    // void push(T e)
    void add(T e);
    //T remove() removes the first and returns it
    T remove();
    //T peek()
    T peek();
    String toString();
}
