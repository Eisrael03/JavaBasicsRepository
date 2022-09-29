package com.syntax.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1=input.nextInt();
		
		System.out.println("Please enter the second number");
		int num2=input.nextInt();

		System.out.println("Please enter the operator you would like to use, choose from +,-,*,/");
		char operator=input.next().charAt(0);
		
		int result=0;
		switch(operator) {
		case'+'://if
			result=(num1+num2); //Syso
			break;//}
		case'-':
			result=(num1-num2);
			break;
		case'*':
			result=(num1*num2);
			break;
		case'/':
			result=(num1/num2);
			break;
			default:
				System.out.println("Please enter a valid operator");
				break;
			} System.out.println(result);
				

	}

}
