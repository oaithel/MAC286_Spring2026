package com.mac286.queues;

public class CircularQueue <T>{
    private T[] Q;
    //size
    private int size;
    private int first, last;
    //default constructor, create an array of 10 elements
    public CircularQueue(){
        Q = (T[]) new Object[4];
        size = 0;
        first = -1;
        last = -1;
    }
    //size() method
    public int size(){
        return size;
    }
    //isEmpty()
    public boolean isEmpty(){
        return (size == 0);
    }
    // void push(T e)
    public void add(T e){
        //check if full, then resize, do it later

        //if empty, add e to index 0 set last and first to 0 size to 1, return

        //advance last by one in a circular way using modulo the length of the array

        //add e to index last,

        //increase size;

    }
    public T remove(){
        //if empty throw an exception

        //save element at index first

        //advance first by one in circular way, using modulo array length.

        //decrease size

        //return saved.
    }

    public T peek(){
        //if empty throw an exception or return null

        //return element at index first.
    }

    public String toString(){
        //if empty return []

        //add the first element to the string,
        //loop size -1 times, starting at (first+1)%length
            //add current element and advance in a circular way (index = (index+1)%length

        //add closing bracket and return the string
    }
}
