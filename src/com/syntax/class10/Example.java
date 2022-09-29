package com.syntax.class10;

public class Example {

	public static void main(String[] args) {
		String[] week = { "Monday", "Sunday", "Friday", "Tuesday", "Thursday"};
        for (String day : week) {

            if (day.equals("Sunday")) {
                System.out.println(day + " is a fun day");
            } else if(day.equals("Friday")) {
                System.out.println(day+ " is a relax day");
            }else {
                System.out.println(day + " is a boring day");
              }
            }
        
	}
	}
