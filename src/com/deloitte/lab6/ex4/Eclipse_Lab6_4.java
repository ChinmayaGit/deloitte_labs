package com.deloitte.lab6.ex4;

import java.util.HashMap;

import java.util.Map;

public class Eclipse_Lab6_4 {

	public static Map<String, String> getStudents(HashMap<String, Integer> students) {
       
        Map<String, String> medalList = new HashMap<>();
		for(Map.Entry<String, Integer> entry :students.entrySet()) {
			int marks=entry.getValue();
			
			if (marks >= 90) {
                medalList.put(entry.getKey(), "Gold");
            } else if (marks >= 80 && marks < 90) {
                medalList.put(entry.getKey(), "Silver");
            } else if (marks >= 70 && marks < 80) {
                medalList.put(entry.getKey(), "Bronze");
            }
		}
		
		return medalList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap<String, Integer> students = new HashMap<>();
		students.put("chinu", 95);
		students.put("xyz", 85);
		students.put("nil", 70);
		students.put("monu", 75);
		 Map<String, String> medalResults = getStudents(students);
		 for (Map.Entry<String, String> entry : medalResults.entrySet()) {
	            System.out.println("Student Reg No: " + entry.getKey() + ", Medal: " + entry.getValue());
	        }
	}

}
