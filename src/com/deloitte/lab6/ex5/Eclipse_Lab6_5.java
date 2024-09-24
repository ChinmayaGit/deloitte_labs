package com.deloitte.lab6.ex5;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Eclipse_Lab6_5 {

	public static int getSecondSmallest(int[] arr) {

		List<Integer> numberList = new ArrayList<>();
		for (int num : arr) {
			numberList.add(num);
		}
		Collections.sort(numberList);

		System.out.println("Sorted numbers: " + numberList);

		int uniqueCount = 0;
		Integer secondSmallest = null;

		for (int i = 0; i < numberList.size(); i++) {

			if (i == 0 || !numberList.get(i).equals(numberList.get(i - 1))) {
				uniqueCount++;
				if (uniqueCount == 2) {
					secondSmallest = numberList.get(i);
					break;
				}
			}
		}

		return secondSmallest;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 7, 3 };

		int secondSmallest = getSecondSmallest(arr);
		System.out.println("Second smallest number is: " + secondSmallest);
	}
}
