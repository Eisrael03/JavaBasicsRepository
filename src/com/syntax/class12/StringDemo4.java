package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str="Shah";
		String str2="Shah";
		String str3= new String("Shah");
		
		if(str.equals("Shah")) {
			System.out.println("I found it");
		}
		/*
		 * equals method checks if two strings are exactly the same with exact same case
		 * equalsIgnoreCase checks if two strings are exactly the same with exact same 
		 * but does not care about the case or letters
		 */
		if(str.equalsIgnoreCase("shah")) {
			System.out.println("I found it with equalsignoreCase");
		}

	}

}
