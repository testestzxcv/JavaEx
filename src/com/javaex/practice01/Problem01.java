package com.javaex.practice01;

public class Problem01 {
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			if((i % 5 == 0) && (i % 7 == 0)) {
				System.out.println(i);
			}
		}
		
		
	}
}
