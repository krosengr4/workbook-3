package com.pluralsight;

import java.util.HashMap;

public class HashMapNotes {

    public static void main(String[] args) {
        //* A HashMap stores items in key/value pairs
        //* To access an element, you use a key. It returns the value associated with that key
        //* The HashMap class is a generic class. The key and the value can be different data types.

        //Calling methods
        addingAndRemoving();
        lookingUpItems();
        iterateThrough();
    }

    //! How to add and remove key/value pairs
    public static void addingAndRemoving() {
        //Creating a HashMap called statesAndCapitals where both key and value are Strings.
        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();

        //! To add items, use .put() method
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("AL", "Montgomery");

        System.out.println("HashMap: " + statesAndCapitals);

        //!To remove an item, use .remove() method and the key
        statesAndCapitals.remove("CA");
        System.out.println("HashMap: " + statesAndCapitals);

        //! Remove all items by using the .clear() method
        statesAndCapitals.clear();
        System.out.println("HashMap: " + statesAndCapitals);
    }

    //! How to look up items
    public static void lookingUpItems() {
        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();

        //use .put() method to add to a hashmap
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("AL", "Montgomery");

        //Use the .get() method and the key to access, and it returns the value
        System.out.println("The capital of Texas is: " + statesAndCapitals.get("TX")); //<--- Output: "The capital of Texas is: Austin"
    }

    //! Iterating through a hashmap
    public static void iterateThrough() {
        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();

        //use .put() method to add to a hashmap
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("AL", "Montgomery");

        //To get only the values
        for(String value : statesAndCapitals.values()) {
            System.out.println(value);
        }

    }
}
