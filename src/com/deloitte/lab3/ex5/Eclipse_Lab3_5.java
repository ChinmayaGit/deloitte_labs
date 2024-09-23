package com.deloitte.lab3.ex5;

import java.util.StringTokenizer;

public class Eclipse_Lab3_5 {
    public static void main(String[] args) {
        String x = "hello every one"; // Corrected "ond" to "one"
        char[] charArray = x.toCharArray();
        System.out.println("Number of characters: " + charArray.length);
        
        StringTokenizer y = new StringTokenizer(x);
        System.out.println("Number of words: " + y.countTokens());
        
        String[] lines = x.split("\n");
        System.out.println("Number of lines: " + lines.length);
    }
}
