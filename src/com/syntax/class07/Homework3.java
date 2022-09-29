package com.syntax.class07;

public class Homework3 {

	public static void main(String[] args) {
		//3. Print even numbers from 20 to 1 (2 ways)
		int i=20;
		while(i>+1) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i--;
		}
					
		System.out.println();
		System.out.println("Another way");
		
		int j=20;
		while (j>=1) {
			System.out.print(j+" ");
			j-=2;
		}
		
		System.out.println();
		System.out.println("Another way");
		for(int e=20 ; e>=1 ; e-=2) {
			if(e%2==0){
            System.out.print(e + " ");
        }
			
		}

	}

}
