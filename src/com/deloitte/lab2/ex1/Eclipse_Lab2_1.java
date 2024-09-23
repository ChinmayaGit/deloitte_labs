package com.deloitte.lab2.ex1;

import java.util.Arrays;

public class Eclipse_Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,5,4,6,0,13,6,16};

//using stream
int[] sortedArr = Arrays.stream(arr).sorted().toArray();
System.out.print(sortedArr[1] + " ");
	}

}
