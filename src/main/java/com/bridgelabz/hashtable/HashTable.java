package com.bridgelabz.hashtable;

public class HashTable {
	public static void main(String[] args) {
		System.out.println("Hash Table program");
		// Creating object as hashCode for LinkedList class
		LinkedList<String, Integer> hashCode = new LinkedList();
		String message = "To be or not to be";

		// String to String[] conversion.
		String[] messageArray = message.toLowerCase().split(" ");
		// Here we are Iterating within the array
		for (String word : messageArray) {
			// Search for the word in the linked list
			Integer value = hashCode.get(word);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
				hashCode.add(word, value);
			}
		}
		// Display the linked list
		System.out.println(hashCode);
	}
}
