package com.mac286.stacks;

import java.util.Random;

//TODO: HW3
public class PracticeStack {
    //design a static method that generates a stack of specific
    // number of integers (num) between -max and +max.
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
        //generate a stack of 20 integers between -300 and +300.
        OurStack<Integer> mainStack = generateStack(20, 300);
        //display it
        System.out.println("Before S: " + mainStack);
        //using two additional helper stacks (in total three stacks)
        OurStack<Integer> S1 = new OurStack<>();
        OurStack<Integer> S2 = new OurStack<>();
        while(!mainStack.isEmpty()){
            //if the number is less than -100 put it in S1, else put it in S2
            if(mainStack.peek() < -100){
                S1.push(mainStack.pop());
            }else{
                S2.push(mainStack.pop());
            }
        }
        //empty S1 into mainStack
        while(!S1.isEmpty()){
            mainStack.push(S1.pop());
        }
        //empty the numbers from -100 to +100 from S2 into mainStack
        //and the others go back to S1
        while(!S2.isEmpty()){
            if(S2.peek() < 100){
                mainStack.push(S2.pop());
            }else{
                S1.push(S2.pop());
            }
        }
        //empty S1 into S2 to restore the order
        while(!S1.isEmpty()){
            S2.push(S1.pop());
        }
        //empty S2 into the main stack (large numbers
        while(!S2.isEmpty()){
            mainStack.push(S2.pop());
        }
        //reorganize the original stack so that numbers smaller than -100 go
        //to the bottom of the original stack, numbers betwen -100 and +100
        //in the middle and number larger than 100 to the top while respecting
        //the relative order in which they were in the original stack.
        //Example input [230, -20, 130, -135, 98, -200, -80, 156, 34, -230]
        //output [-135, -200, -230, -20, 98, -80, 34, 230, 130, 156]

        System.out.println("After S: " + mainStack);

        /*TODO: HW4 Generate a new stack same as above, and reorganize it the same way

        1- Using one queue and one stack for help;

        2- Using one OurVector object only for help;

        3- Challenging: Using one single queue for help;

         */


    }

}