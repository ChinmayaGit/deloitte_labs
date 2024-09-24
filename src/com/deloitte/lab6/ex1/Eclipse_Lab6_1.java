package com.deloitte.lab6.ex1;

import java.util.*;

public class Eclipse_Lab6_1 {

	public static <K, V extends Comparable<V>> List<V> getValues(HashMap<K, V> map) {

		Collection<V> values = map.values();

		List<V> sortedValues = new ArrayList<>(values);

		Collections.sort(sortedValues);

		return sortedValues;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Alice", 50);
		map.put("Bob", 10);
		map.put("Charlie", 30);
		map.put("David", 20);
		map.put("Eve", 40);

		List<Integer> sortedValues = getValues(map);

		System.out.println("Sorted values: " + sortedValues);
	}
}
