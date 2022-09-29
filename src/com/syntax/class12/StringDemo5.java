package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str="I love java programming";
		/*
		 * charAt returns us the character at a specific index
		 */
		for(int i=0; i<str.length(); i++) {
			if (!(str.charAt(i)==' ')){
			System.out.println(str.charAt(i));
		}
			
	   }	

   }
}
