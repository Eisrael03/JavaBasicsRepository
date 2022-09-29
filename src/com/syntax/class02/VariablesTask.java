package com.syntax.class02;

public class VariablesTask {

	public static void main(String[] args) {
		String first="Eric";
		String last="Sorto";
		String city="Annandale ";
		String state="Virginia ";
		int grade= 11;
		String phone="703 945 9205";
		
		System.out.println("My name is "+first+" and my last name is "+ last);
		System.out.println("I am a "+ grade +"th grade student ");
		System.out.println("I live in " + city + state );
		System.out.println("my phone number is "+ phone);
		// part b
		
		city="Miami ";
		state="Florida";
		phone="1234567890";
		grade=12;
		
		System.out.println("My name is "+ first +" and I moved to " + city + state );
		System.out.println("My new number is " + phone);
		
		//Rules for identifiers(variables,methods)
		//1. cannot use keywords as identifiers
		//String new="hello"-> error
		
		//2. cannot have spaces
		//String last name=" smith"
		
		//3. identifiers cannot start with numbers 
		//
		
		/*4.identifiers cannot use any special characters 
		 * except $ or _
		 */
		
		double $price=9.98;
		float _price1_=1.99f;
		
		/*naming conventions
		 * Class should stsrt with Uppercase and follow Camel casing
		 * variables should start with lowercase and follow camel casing
		 */
		String Weather="hot"; //not preferred 
		String myWeather="cold";//preferred
		
		
		

	}

}
