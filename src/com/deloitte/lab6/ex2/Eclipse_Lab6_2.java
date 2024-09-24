package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Eclipse_Lab6_2 {


	    public static Map<Character, Integer> countChars(char[] arr) {
	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        // Loop through the character array
	        for (char c : arr) {
	            // If the character is already in the map, increment its count
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                // If the character is not in the map, add it with count 1
	                charCountMap.put(c, 1);
	            }
	        }
	        
	        return charCountMap;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        char[] arr = {'a', 'b', 'c', 'a', 'b', 'a'};
	        Map<Character, Integer> result = countChars(arr);
	        
	        // Print the result
	        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}
