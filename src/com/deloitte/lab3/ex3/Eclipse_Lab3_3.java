package com.deloitte.lab3.ex3;

import java.util.Set;

public class Eclipse_Lab3_3 {

	static String alterString (String x) {
		
		 Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		 StringBuilder result = new StringBuilder(x.length());
		 
		 for(int i=0;i<x.length();i++) {
			 char ch=x.charAt(i);
			 
			 if(Character.isLetter(ch) && vowels.contains(ch)) {
				 if (ch == 'z') {
	                    result.append('a');
	                } else if (ch == 'Z') {
	                    result.append('A');
	                } else {
	                    result.append((char) (ch + 1));
	                }
			 }else {
				 result.append(ch);
			 }
		 }
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alterString("JAVA"));
	}

}
