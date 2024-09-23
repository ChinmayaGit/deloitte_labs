package com.deloitte.lab3.ex2;

public class Eclipse_Lab3_2 {

	static String getImage(String word) {

		StringBuffer sb = new StringBuffer(word);

		sb.reverse();

		return word + "|" + sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getImage("hello"));
	}

}
