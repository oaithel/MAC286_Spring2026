package com.mac286.queues;

import java.util.Arrays;
import java.util.EmptyStackException;

public class OurQueue <T>{
    private T[] Q;
    //size
    private int size;
    //default constructor, create an array of 10 elements
    public OurQueue(){
        Q = (T[]) new Object[10];
        size = 0;
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
        if(size == Q.length){
            //full resize
            Q = Arrays.copyOf(Q, Q.length*2);
        }
        Q[size] = e;
        size++;
    }
    //T remove() removes the first and returns it
    public T remove(){

    }
    //T peek()
    public T peek(){
        if(this.isEmpty()){
            return null;
        }
        return Q[0];
    }
    //toString()
    public String toString(){
        if(this.isEmpty()) {
            return "[]";
        }
        String st = "[" + Q[0];
        for(int i =1; i < size; i++){
            st += ", " + Q[i];
        }
        st += "]";
        return st;
    }
}
