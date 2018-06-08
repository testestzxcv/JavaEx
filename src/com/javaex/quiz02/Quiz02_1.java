package com.javaex.quiz02;

public class Quiz02_1 {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		boolean result;
		
		result = (a%2==0)? true:false;
		System.out.println("a는 짝수입니까?" +result);
		
		result = (b % 3 == 0)? true:false;
		System.out.println(result);
		
		boolean r1 = ((a % 2 == 0) && (b % 3 == 0));
		System.out.println(r1);
		
		char r2 = (char)(c+4);
		System.out.println(r2);
		
	}
}

