package com.syntax.class02;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// +,-,*./,%
		int a=900;
		int b=100;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		System.out.println(" ---------------------   ");
		int e=10;
		int f=5;
		System.out.println("division = "+e/f); //2
		System.out.println("remainder = "+ e%f); //0
		System.out.println(20%9);//2
		System.out.println(" ---------------------   ");
		
		int c=10;
		int d=3;
		int sum=c+d;
		int sub=c-d;
		int remainder=c%d; //10/3=1
		int div=c/d; //10/3=3
		  System.out.println("sum is = "+sum);
		  System.out.println("sub is= "+sub);
		  System.out.println("reminder is = "+ remainder);//10%3=1
		  System.out.println("Division of integers = "+div);//10/3=3
		  
		  double num1=10.000000000;
		  double num2=3.0000000000;
		  System.out.println("division of double=" + num1/num2);
		  
		  float number1=10.0f;
		  float number2=3.0f;
		  System.out.println("division of float=" + number1/number2);
		  System.out.println("   remainder examples  ");
		  //remainder- mod operator - % -
		  System.out.println(16%13);
		  
		  System.out.println("what is the the output ");
		  System.out.println(10+10/10);
		  System.out.println((10+10)/10);
		
		

	}

}
