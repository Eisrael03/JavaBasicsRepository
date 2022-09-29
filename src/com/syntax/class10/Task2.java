package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		String[][] arr= {

                {"Yusuf", "Hamza", "Adam", "John"},
                {"A", "B", "C", "D"}
        };
		
		
		
		System.out.println();

        System.out.println(arr[0][0]+"="+arr[1][0]);
        System.out.println(arr[0][1]+"="+arr[1][1]);
        System.out.println(arr[0][2]+"="+arr[1][2]);
        System.out.println(arr[0][3]+"="+arr[1][3]);
        
        System.out.println();
        System.out.println();
        
        for(int i=0; i<arr.length; i++) {
        	for (int j=0; j<arr[i].length; j++) {
        		System.out.println(arr[i][j]);
        	}
        }
}

	}


