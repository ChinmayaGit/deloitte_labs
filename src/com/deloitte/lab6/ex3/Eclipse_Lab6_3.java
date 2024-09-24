package com.deloitte.lab6.ex3;

import java.util.HashMap;

import java.util.Map;

public class Eclipse_Lab6_3 {
	public static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> squareMap = new HashMap<>();

		for (int x : arr) {
			squareMap.put(x, (x * x));

		}
		return squareMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 5, 6 };
		Map<Integer, Integer> result = getSquares(arr);

		System.out.println("Number : Square");
		for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
