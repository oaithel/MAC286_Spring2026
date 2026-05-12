package com.mac286.binarysearchtree;

import com.mac286.heaps.OurHeap;
import com.mac286.heaps.PracticeHeaps;

import java.util.Arrays;

//Add a method smallest that returns the smallest key in a
//binary search tree.
//generate an array of 10 integers. Using a binarySearch tree
//sort the array from the smallest to the largest.
public class Practice {
    public static void main(String[] args) {
        int[] array = PracticeHeaps.generateArray(10, 300);
        System.out.println("Before: " + Arrays.toString(array));
        BTree<Integer, Integer> T = new BTree<>();
        for(int i = 0; i < array.length; i++){
            T.insert(array[i], array[i]);
        }
        int index = 0;
        while(!T.isEmpty()){
            int num = T.smallest();
            array[index] = num;
            T.delete(num);
            index++;
        }
        System.out.println("After: " +Arrays.toString(array));

    }

}
