package com.syntax.class09;

public class ArrayFixedSize {

	public static void main(String[] args) {
		int[] nums= new int[3];
		nums[1]=12;
		nums[2]=13;
		
		System.out.println(nums[0]);
		
		
		
		System.out.println();
		
		
		
		String[] colors= new String[3];
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Blue";
		//colors[3]="Yellow";//ArrayIndexyOutOfBoundsException: 3
		
		System.out.println(colors[1]);
		
	}

}
