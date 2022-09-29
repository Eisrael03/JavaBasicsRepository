package com.syntax.class06;

import java.util.Scanner;

//HOMEWORK: 1. Ask user to enter their country and capture it. 
//Once values are captured print which language user speaks.
public class Homework1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please tell me what country you're from.");
		String country=scan.nextLine();
		String language = null;
		
		switch(country) {
		case "USA":
			language="English";
			break;
		case "El Salvador":
			language="Spanish";
			break;
		case "France":
			language="French";
			break;
		case "Yemen":
			language="Arabic";
			break;
		case "Russia":
			language="Russian";
			break;		
			case "China":
			language="Chinese";
			break;
		case "Japan":
			language="Japanese";
			break;
		default:
			language="System doesn not know";
			break;
		
			}
		System.out.println("You are from "+country+" you speak "+language);
	

}
	}