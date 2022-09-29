package com.syntax.class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		String str= "I love java programming";
		/*
		 * toCharArray will convert a String to an array of chars 
		 */
		char[] charArray=str.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[19]);
		
		int counter=0;
		for(char c:charArray) {
			
			if(c =='m') {
				counter++;
			}
		}
		System.out.println("letter m has appeared "+counter+" times");

  }
}
