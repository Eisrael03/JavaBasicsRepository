package com.syntax.class06;

import java.util.Scanner;

public class Homework3pt2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your first number");
		int num1=input.nextInt();
		System.out.println("Please enter your second number");
		int num2=input.nextInt();
		System.out.println("Please enter the operator you would like to use,choose from +,-,*,/");
		char operator=input.next().charAt(0);
		int sum=(num1+num2);
		int sub=(num1-num2);
		int div=(num1/num2);
		int mult=(num1*num2);
		if(operator=='+') {
		System.out.println(sum);
		}else if(operator=='-'){
			System.out.println(sub);
			}else if(operator=='*'){
				System.out.println(mult);
				}else if(operator=='/'){
					System.out.println(div);
					}else{
						System.out.println("Invalid operator");
						}
		
				
	}

}
