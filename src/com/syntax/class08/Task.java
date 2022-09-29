package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int secretNumber=47;
		int user=0;
		
		do {
		System.out.println("Guess the secret number!!");
		user = in.nextInt();
		
		}while (user != secretNumber);
		
		System.out.println("You Guessed it! You won!!");
		

	}

}
