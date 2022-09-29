package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		int money=66000;
		if (money>=65000) {System.out.println("I can buy a tesla!");}
		else {System.out.print("I needa look for cheaper cars");}
		
		int number= 19;
		
		if(number!=18);{ System.out.println("This number is not 18");}
		
		int day=4;
		
		if(day==1) {System.out.println("Monday");
		} else if(day==2) {
			System.out.println("Tuesday");
		} else if(day==3) {
			System.out.println("Wednesday");
		} else if (day==4) {
			System.out.println("Thursday");}
		else if (day==5) {
		    System.out.println("Friday");
		}else if (day==6) {
		    System.out.println("Saturday"); 
		}else if (day==7) {
		    System.out.println("sunday");
		} else {
		    System.out.println("Please enter a valid day number(1-7");}
		
		System.out.println(" -------------------   ");
        String name;

        switch (day) {
        case 1:
            name = "Monday";
            break;
        case 2:
            name = "Tuesday";
            break;
        case 3:
            name = "Wednesday";
            break;
        case 4:
            name = "Thursday";
            break;
        case 5:
            name = "Friday";
            break;
        case 6:
            name = "Saturday";
            break;
        case 7:
            name = "Sunday";
            break;
        default:
            name = "Invalid";
            break;
        }

        System.out.println(name);

	}

}
