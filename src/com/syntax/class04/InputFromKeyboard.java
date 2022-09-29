package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*
		 * scanner is a class that helps us take the input of the keyboard 
		 * it contains many different smaller modules calles methods that can help
		 * it takes Strings booleans basically all types of data from the keyboard
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("please enter your name");
		/*
		 * Activates java program to take input from keyboard and and store
		 * it inside the name variable
		 */
		String name=input.next();
		//prints whatever namer user enters on keyboard
		System.out.println("Hello "+name+" dont be confused you will learn;)");
		
	}

}
