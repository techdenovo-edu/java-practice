package com.techdenovo.edu.collectionsdemo;

import java.util.LinkedList;;
public class LinkedListExample {

	public void exampleOfLinkedList() {		
	        // Create a LinkedList of Strings
	        LinkedList<String> cities = new LinkedList<>();

	        // Add elements to the LinkedList
	        cities.add("New York");
	        cities.add("Los Angeles");
	        cities.add("Chicago");
	        cities.add("Houston");

	        // Print the LinkedList
	        System.out.println("Original LinkedList: " + cities);

	        // Add an element at a specific position
	        cities.add(2, "San Francisco");
	        System.out.println("After adding an element at index 2: " + cities);

	        // Remove an element by index
	        cities.remove(3);
	        System.out.println("After removing the element at index 3: " + cities);

	        // Remove an element by value
	        cities.remove("Houston");
	        System.out.println("After removing 'Houston': " + cities);

	        // Access an element
	        String firstCity = cities.get(0);
	        System.out.println("First city: " + firstCity);

	        // Update an element
	        cities.set(1, "Seattle");
	        System.out.println("After updating the second city: " + cities);

	        // Check if a LinkedList contains an element
	        boolean containsLA = cities.contains("Los Angeles");
	        System.out.println("Contains 'Los Angeles': " + containsLA);

	        // Size of the LinkedList
	        System.out.println("Size of the LinkedList: " + cities.size());

	        // Iterate through the LinkedList using a for-each loop
	        System.out.println("Cities:");
	        for (String city : cities) {
	            System.out.println(city);
	        }

	        // Clear the LinkedList
	        cities.clear();
	        System.out.println("After clearing: " + cities);
	    }

	
	

}
