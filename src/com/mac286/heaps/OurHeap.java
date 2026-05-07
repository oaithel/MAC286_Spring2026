package com.mac286.heaps;

import java.util.Arrays;

public class OurHeap<T extends Comparable<T>> {
    private T[] H;
    private int size;
    public OurHeap(){
        H = (T[])new Comparable[10];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    private void resize(){
        H = Arrays.copyOf(H, H.length*2);
    }
    public void add(T e){
        //if full resize

        //add e at index size, increase size

        //heapify at index size-1
    }
    private void heapify(int ind){
        //if ind is 0 then return

        //find index of parent indParent

        //compare element at ind to element at indParent, if smaller
        //then swap elements at ind and indParent, then
        // heapify at indParent
        // if not smaller then return.
    }
    public String toString(){
        //if empty return []
        //start adding the first element with bracket and no comma

        //for the size-1 other elements add comma then element

        //end of loop add ] to the string and return it
    }
}
