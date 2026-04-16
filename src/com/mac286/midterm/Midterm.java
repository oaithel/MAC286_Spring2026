package com.mac286.midterm;

import com.mac286.linkedlists.OurLinkedList;
import com.mac286.stacks.OurStack;

import java.util.Random;

public class Midterm {
    public static OurStack<Integer> generateStack(int n, int max) {
        //create a stack of integers
        OurStack<Integer> S = new OurStack<>();
        //create a random number generator
        Random generator = new Random();
        for(int i = 0; i < n; i++) {
            //loop n times
            //generate a number between -max and +max
            int num = generator.nextInt(-max, max);
            //push it to the stack
            S.push(num);
        }
        //return the stack
        return S;
    }

    public static void main(String[] args) {
        //generate a stack
        OurStack<Integer> mainStack = generateStack(20, 300);
        System.out.println("Before S: " + mainStack);
        OurStack<Integer> SN = new OurStack<>();
        OurStack<Integer> SP = new OurStack<>();
        int numNegatives = 0, numPositives = 0;
        while(!mainStack.isEmpty()){
            if(mainStack.peek() < 0){
                SN.push(mainStack.pop());
                numNegatives++;
            }else{
                SP.push(mainStack.pop());
                numPositives++;
            }
        }
        //if more negatives start with negatives else with positives
        if(numNegatives > numPositives){
            while(!SN.isEmpty() && !SP.isEmpty()){
                mainStack.push(SN.pop());
                mainStack.push(SP.pop());
            }
        }else{
            while(!SN.isEmpty() && !SP.isEmpty()){
                mainStack.push(SP.pop());
                mainStack.push(SN.pop());
            }
        }
        //At this point
        while(!SN.isEmpty()){
            mainStack.push(SN.pop());
        }
        while(!SP.isEmpty()){
            mainStack.push(SP.pop());
        }
        System.out.println("After, S: " + mainStack);
        mainStack = generateStack(20, 300);
        System.out.println("Before S: " + mainStack);
        OurLinkedList<Integer> list = new OurLinkedList<>();
        numNegatives = 0;
        numPositives = 0;
        while(!mainStack.isEmpty()){
            if(mainStack.peek() < 0){
                numNegatives++;
                list.add(numPositives, mainStack.pop());
            }else{
                numPositives++;
                list.addFirst(mainStack.pop());
            }

        }

        if(numNegatives > numPositives) {
            while (numNegatives > 0 && numPositives > 0) {
                //here the front should be positive
                mainStack.push(list.remove(numPositives));
                numNegatives--;
                mainStack.push(list.removeFirst());
                numPositives--;

            }
        }else {
            while (numNegatives > 0 && numPositives > 0) {
                //here the front should be positive
                mainStack.push(list.removeFirst());
                numPositives--;
                mainStack.push(list.remove(numPositives));
                numNegatives--;
            }
        }

        while (!list.isEmpty()) {
            mainStack.push(list.removeFirst());
        }

        System.out.println("After S: " + mainStack);
    }

}
