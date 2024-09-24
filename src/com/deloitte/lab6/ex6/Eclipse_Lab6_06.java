package com.deloitte.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Eclipse_Lab6_06 {

    // Main method
    public static void main(String[] args) {
        Map<String, LocalDate> people = Map.of(
            "ID001", LocalDate.of(2000, 5, 14),
            "ID002", LocalDate.of(2010, 3, 21),
            "ID003", LocalDate.of(1995, 7, 10),
            "ID004", LocalDate.of(2005, 11, 30)
        );

        List<String> eligibleVoters = votersList(people);
        System.out.println("Eligible voters' IDs: " + eligibleVoters);
    }

    // Method to generate the list of voters based on age
    public static List<String> votersList(Map<String, LocalDate> people) {
        List<String> eligibleVoters = new ArrayList<>();

        for (Map.Entry<String, LocalDate> entry : people.entrySet()) {
            String id = entry.getKey();
            LocalDate dob = entry.getValue();
            int age = Period.between(dob, LocalDate.now()).getYears();

            if (age > 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters;
    }
}
