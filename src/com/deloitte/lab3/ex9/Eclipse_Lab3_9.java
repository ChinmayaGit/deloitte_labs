package com.deloitte.lab3.ex9;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Eclipse_Lab3_9 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("(yyyy-MM-dd): ");
	        String inputDate = scanner.nextLine();
	        
	        printDuration(inputDate);
	        scanner.close();
	    }

	    public static void printDuration(String inputDate) {
	 
	        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        LocalDate currentDate = LocalDate.now();
	       
	        Period period = Period.between(date, currentDate);
	      
	        System.out.println("Duration from " + date + " to " + currentDate + ":");
	        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
	    }
	}
