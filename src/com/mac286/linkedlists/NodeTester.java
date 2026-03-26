package com.mac286.linkedlists;

public class NodeTester {
    public static void main(String[] args) {
        //recreate the list in oneNote
        //create N1 with -1 as data
        Node<Integer> N1 = new Node<>(-1);
        //create N2 with -3
        Node<Integer> N2 = new Node<>(-3);
        //reate N5 with -7
        Node<Integer> N5 = new Node<>(-7);
        //make N2 the next of N1, link N2 to N1
        N1.setNext(N2);
        //set N5 as the next of N2
        N2.setNext(N5);
        //Set a reference Head to the first node N1
        Node<Integer> Head = N1;
        Node<Integer> Tail = N5;
        //show the content of N2 using Head reference:
        System.out.println("N2: " + Head.getNext().getData());
        //Change the content of N2 to -9, using only Head reference.
        Head.getNext().setData(-9);
        //display the N2 using only Head reference.
        System.out.println("N2: " + Head.getNext().getData());
        //create a new Node N3 with value -13, put it between N1 and N2 using only Head
        //as a reference.
        Node<Integer> N3 = new Node<>(-13, Head.getNext());
        //set next of N1 to N3
        Head.setNext(N3);
        //show the content of N3 using Head
        System.out.println("N3: " + Head.getNext().getData());
        //remove N1 from the list, using only Head reference and make Head refer to N3 now.
        Head = Head.getNext();
        //display the content of Head.
        System.out.println("Head: " + Head);
        //add N4 (-7) to the end of the list
        Node<Integer> N4 = new Node<>(-17);
        //set next of Tail to N4
        Tail.setNext(N4);
        Tail = N4;
        //Using one temporary reference display the content of te entire list
        Node<Integer> temp = Head; //temp = N3
        System.out.println(" " + temp.getData());
        //move to the next node
        temp = temp.getNext(); //temp is N2
        System.out.println(" " + temp.getData());
        //move to the next node
        temp = temp.getNext(); //temp = N5
        System.out.println(" " + temp.getData());
        //move to the next node
        temp = temp.getNext(); //temp = N4
        System.out.println(" " + temp.getData());

        //Use a while loop and stop when the next is null
        temp = Head; //temp = N3
        System.out.print("[" + temp.getData());
        temp = temp.getNext();
        while(temp!=null){
            System.out.print(", " + temp.getData() );
            temp = temp.getNext();
        }
        System.out.println("]");
    }
}
