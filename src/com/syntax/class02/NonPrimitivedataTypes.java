package com.syntax.class02;

public class NonPrimitivedataTypes {

	public static void main(String[] args) {
		
		// string is just one example of a non primitive data type
		
		String name="Asma";
		
		String address="123 address street";
		
		String phone="123 456 7890";
		
		//String age="17" // anything you put in " is string 
		//17 should be int
		int age=17;
		
		System.out.println(name); //use the data type 
		System.out.println(address);
		System.out.println(phone);
		 
		//"My name is"+ Asma
		System.out.println("My name is " + name);
		
		//Asma is 17
		System.out.println(name + " is " + age);
		
		String fruit="Apple";
		double price=1.99;
		System.out.println("The price of the "+fruit+" is "+ price);
		
		/*to attach any value(int,double,boolean,char,string etc.)
		 * to a string we use +
		 * + next to the Strings acts as Concatenation
		 */
		fruit="Mango";
		price=3.99;
		System.out.println("The price of the "+fruit+" is "+ price);
		
		
				

	}

}
