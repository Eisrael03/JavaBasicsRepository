package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		String str =" i love java ";
		System.out.println(str);
		/*
		 * Remove spaces before and after the String
		 * But not the ones which are present in between
		 */
		System.out.println(str.trim());
		
		
		String str2="Java is very easy";
		/*
		 * startsWith => Checks if String starts with specific letter or word 
		 * endsWith => Checks if String ends with specific letter or word 
		 * contains => Checks if String contains specific letter or word 
		 */
		
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("y"));
		/*
		 * Method chaining helps us call multiple methods on a single line on ,method after another
		 */
		System.out.println(str2.toLowerCase().contains("very"));
		

	}

}
