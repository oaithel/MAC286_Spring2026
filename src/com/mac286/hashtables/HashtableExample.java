package com.mac286.hashtables;

import com.mac286.heaps.OurHeap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> Tab = new Hashtable<>(20, 0.8f);
        Tab.put(11209, "BayRidge");
        Tab.put(11101, "Long Island City");
        Tab.put(10000, "Manhattan");
        System.out.println("Tab: " + Tab.toString());
        System.out.println("ramoving zip 10000: " + Tab.remove(10000));
        System.out.println("Tab: " + Tab.toString());
        Tab.put(11111, "No Clue");
        System.out.println("Value at 11111: "+ Tab.get(11111));
        Tab.put(11377, "Woodside");
        System.out.println("Tab: " + Tab.toString());
        //Going through elements of a hashtable.
        //1- get the set of the keys
        Set<Integer> keys = Tab.keySet();
        //use a for loop to go throught the set of keys
        for(Integer k: keys){
            System.out.println(k + " = " + Tab.get(k));
        }

        System.out.println("Tab: " + Tab);
        Tab.put(11111, "someting else");
        System.out.println("Tab: " + Tab);

    }
}
