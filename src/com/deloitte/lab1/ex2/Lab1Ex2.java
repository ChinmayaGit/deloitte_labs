package com.deloitte.lab1.ex2;

import java.util.Scanner;
public class Lab1Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.print("Red: 1\nYellow: 2\nGreen: 3\n");
		System.out.print("Enter a number: ");
	
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Stop");			
			break;
		case 2:
			System.out.println("Ready");			
			break;
		case 3:
			System.out.println("Go");			
			break;
			default:
				System.out.println("Please enter 1,2 or 3");			
				break;
		}
		sc.close();
	}

}
