package com.syntax.class07;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		//Scanner in= new Scanner(System.in);
        //System.out.println("Please pay for the coffee");
        //user= in.nextDouble();
		double price = 2.85;
        double user=0.0;
        Scanner in= new Scanner(System.in);

        
        do {

            System.out.println("Please pay for the cofee");
            user= in.nextDouble();
            
            if(user > price) {
            
            	System.out.println("Please give lesser price");
            
            }else if(user < price){
                
            	System.out.println("Please give more price");
            }
        
        }while(user != price);

        System.out.println("Please enjoy your coffee");


	}

}
