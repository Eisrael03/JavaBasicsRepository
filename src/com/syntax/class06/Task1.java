package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        String season = null;
        System.out.println("what is your birth month");
        String month=scan.next();
        if (month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May"))
        season="Spring";
        else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August"))
        season="Summer";
        else if (month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February"))
        season="Winter";
        else if (month.equalsIgnoreCase("Septemper")||month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November"))
            season="Fall";
        System.out.println("You were born in "+season);

	}

}
