package com.mac286.stacks;

import java.util.Stack;

/*
A stack is data structure with the following porperties:
- New items are added to the top of the stack (push)
- The top of the stack is removed when invoking pop.
The standard interface of a stack is the following:
- Default constructor
- size() returns the number of items in the stack
- isEmpty() returns true if the stack is emtpy, false otherwise
- void push(T e) adds e top the top of the stack
- T pop() removes the top and returns it
- T peek() returns the top without removing it.
- toString.
 */
public class StackTester {
    public static void main(String[] args) {
        //Stack<Integer> S = new Stack<>();
        //OurStack<Integer> S = new OurStack<>();
        wStack<Integer> S = new wStack<>();
        System.out.println("poping: " + S.peek());
        //push -1, -3, -9, -7
        S.push(-1);
        S.push(-3);
        System.out.println("S: " + S);
        S.push(-9);
        S.push(-7);
        System.out.println("S: " + S);
        System.out.println("poping: " + S.pop());
        System.out.println("S: " + S);
        System.out.println("Thje top of S is: " + S.peek());
        System.out.println("S: " + S);
    }
}
