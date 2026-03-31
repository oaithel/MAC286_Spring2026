package com.mac286.linkedlists;

import com.mac286.arrays.OurVector;

import java.util.EmptyStackException;

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
        Node<T> newNode = new Node<>(e);
        //if the list is empty, then set both Head and Tail to newNode, size to 1
        //return.
        if(this.isEmpty()){
            Tail = Head = newNode;
            size = 1;
            return;
        }

        //set next of Tail to new Node,
        Tail.setNext(newNode);
        Tail = newNode;
        //set Tail to new Node,
        //increase size
        size++;
    }

    //remove removes the first and returns the data
    public T remove(){
        //if empty throw EmptyStackException
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        //save the data in the first node
        T save = Head.getData();
        //set Head to the next of Head
        Head = Head.getNext();
        //decrease size
        size--;
        //if size is 0, set Head and Tail to null
        if(size == 0){
            Tail = Head = null;
        }
        //return the saved
        return save;
    }
    public T poll(){
        return this.remove();
    }
    public T pop(){
        return this.remove();
    }

    public T peek(){
        //return the data at the Head. Null if empty
        if(this.isEmpty()){
            return null;
        }
        return Head.getData();
    }
    public void addFirst(T e){


    }
    public void addLast(T e){
        this.add(e);
    }
    public void add(int ind, T e){
        //check ind is valid index otherwise throw IndexOutOfBoundsException

        //have a reference to start at Head, temp
        //move ind-1 times in the list

        //create a new Node
        //set next of newNode to next of temp
        //set next of temp to newNode
        //increase size
    }
    public String toString(){
        //Already given in NodeTester.
        if(this.isEmpty()){
            return "[]";
        }
        Node<T> temp = Head; //temp = N3
        String st = "[" + temp.getData();
        temp = temp.getNext();
        while(temp!=null){
            st +=  ", " + temp.getData();
            temp = temp.getNext();
        }
        return st +"]";
    }
}
