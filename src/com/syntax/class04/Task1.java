package com.syntax.class04;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner dip= new Scanner(System.in);
		System.out.println("Do you have a diploma? please enter true or false");
		boolean haveDiploma= dip.nextBoolean();
		
		if (haveDiploma) {System.out.println("Congratulations!!");
		System.out.println("Whats your GPA score?");}
		else {System.out.println("we suggest you get a degree");}
		
		double gpa=dip.nextDouble();
		
		if(gpa>=3.5) {System.out.println("You are eligable for a scholarship!!!");
		} else if(gpa<3.5) {System.out.println("You should've studied harder");
		
	}

}}
