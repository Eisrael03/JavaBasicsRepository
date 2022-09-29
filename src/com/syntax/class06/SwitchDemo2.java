package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// matching cases must be of the same data type as a variable in switch
        // no duplicated case in switch

        char choice='Y';
        String answer;

        switch(choice) {
        case 'Y':
            answer="Yes";
            break;
        case 'N':
            answer="No";
            break;
        case 'M':
            answer="Maybe";
            break;
        default:
            answer="Unkown";
            break;
        }
    System.out.println(answer);
//Limitations of switch case
    /*
     * cannot use logical operators
     * cannot use relational operators
     * CANNOT work with double float and long data types 
     * CANNOT work with boolean values
     */

	}

}
