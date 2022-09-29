package com.syntax.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="user1";
		String password="pass1237";
		String confirmPassword="pass1237";
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scanner.next();
		System.out.println("Please enter password");
		password=scanner.next();
		System.out.println("Please confirm password");
		confirmPassword=scanner.next();
		
		
        
		
		if(userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }else if(password.length()<8) {
            System.out.println("Password is too short");
        }else if(password.contains(userName)) {
        	System.out.println("Password cannot contain username");
        }else if (!password.equals(confirmPassword)|| !confirmPassword.equals(password)){
        	System.out.println("Passwords do not match");
        }else {
        	System.out.println("Your username and password has been created");
        }
       

	}

}
