package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Eclipse_Lab2_4 {
 
	    public static void main(String[] args) {
	        Integer[] arr = {5, 3, 8, 1, 9, 3, 8, 5};  
       
	        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
   
	        Integer[] uniqueArr = set.toArray(new Integer[0]);
    
	        Arrays.sort(uniqueArr, Collections.reverseOrder());

	        System.out.println(Arrays.toString(uniqueArr));
	    }
	}