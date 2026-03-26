package com.mac286.linkedlists;

import com.mac286.arrays.OurVector;
//TODO: HW
public class OurLinkedList <T>{
    private Node<T> Head, Tail;
    private int size;

    public OurLinkedList(){
        Head = Tail = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    //add method adds to the back
    public void add(T e){
        //add T to the back
        //create a Node with e
        //if the list is empty, then set both Head and Tail to newNode, size to 1
        //return.

        //set next of Tail to new Node,
        //set Tail to new Node,
        //increase size
    }

    //remove removes the first and returns the data
    public T remove(){
        //if empty throw EmptyStackException
        //save the data in the first node
        //set Head to the next of Head
        //decrease size
        //if size is 0, set Head and Tail to null
        //return the saved
    }
    public T poll(){
        return this.remove();
    }
    public T pop(){
        return this.remove();
    }

    public T peek(){
        //return the data at the Head. Null if empty
    }
    public String toString(){
        //Already given in NodeTester.
    }
}
