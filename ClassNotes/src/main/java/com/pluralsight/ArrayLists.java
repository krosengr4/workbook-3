package com.pluralsight;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        //Calling methods for each subsection we went over
        arrayLists();
    }

    private static void arrayLists() {
        ArrayList<String> names = new ArrayList<String>();
        //You can add to the array. Mutable
        names.add("Kevin");
        names.add("Michelle");
        names.add("Michael");
        System.out.println("Names: " + names);

        //how to print out one name
        System.out.println("One name: " + names.get(0));

        //You can change object values within the array
        names.set(2, "Brandon");
        System.out.println("New names: " + names);

        //You can remove an item from the array
        names.remove(1);
        System.out.println("Names after one removed: " + names);

    }

}
