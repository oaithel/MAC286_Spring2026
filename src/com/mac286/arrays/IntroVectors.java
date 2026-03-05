package com.mac286.arrays;

/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/
/*
A Vector is a data structure that allows the use of an array in
an easy way. You can add elements to an array at any index
as long as no space is left empty.
To create a Vector we use:
Vector<Type> VectorName = new Vector(size, increment);
size if the initial length of the vector. How many elements
can you add there.
Increment is a number by how much the Vector grows each time
it reaches capacity

*/

import java.sql.SQLOutput;
import java.util.Vector;

public class IntroVectors {
    public static void main(String args[]) {
        Vector<Integer> V = new Vector(5, 10);
        //inial length is 5, when we reach 5, it's resized
        //to 15.
        System.out.println("V.capcity(): " + V.capacity() + " V.size: " + V.size() +
                "\nV: " + V);
        V.add(-1);
        V.add(-5);
        System.out.println("V.capcity(): " + V.capacity() + " V.size: " + V.size() +
                "\nV: " + V);
        /*
        V.add(0, -11); //adding -11 at index 0
        System.out.println("V.capcity(): " + V.capacity() + " V.size: " + V.size() +
                "\nV: " + V);

        //add -9 between -1 and -5
        V.add(2, -9); //adds -9 at index 2, -5 is pushed up
        System.out.println("V.capcity(): " + V.capacity() + " V.size: " + V.size() +
                "\nV: " + V);
        V.add(-7); //adds to the back of the array
        System.out.println("V.capcity(): " + V.capacity() + " V.size: " + V.size() +
                "\nV: " + V);
        V.add(3, -13); //adds -13 at index 3, -5 and -7 are pushed up by 1
        System.out.println("V.capcity(): " + V.capacity() + " V.size: " + V.size() +
                "\nV: " + V);
        //remove from the back
        int temp = V.removeFirst();
        System.out.println("Removed " + temp + " V: " + V + " V.size " + V.size() + " capa: " + V.capacity()); //-1, -9 ...all pushed down by 1
        temp = V.removeLast();
        System.out.println("Removed " + temp + " V: " + V + " V.size " + V.size() + " capa: " + V.capacity());
        //remove -13
        temp = V.remove(2);//removes element at index 2
        System.out.println("Removed " + temp + " V: " + V + " V.size " + V.size() + " capa: " + V.capacity());
        //adding at index 4 with trigger an IndexOutOfBoundsException as 4 will leave a space at 3
        V.add(4, -21);

         */
    }
}