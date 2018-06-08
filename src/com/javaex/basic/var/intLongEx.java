package com.javaex.basic.var;

public class intLongEx {
	public static void main(String[] args) {
		//	int 변수의 선언
		int intVar1;
		int intVar2;
		
		intVar1 = 2018;
//		intVar2 = 1234567890123;	//	out of range1
		
		System.out.println(intVar1);
		
		//	long 변수의 선언
		long longVar1;
		long longVar2;
		
		longVar1 = 2018;
		longVar2 = 1234567890123L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//	2진수, 8진수, 16진수
		int bin;
		int oct;
		int hex;
		
		bin = 0b1100;	//	2진수 0b
		oct = 072;		//	8진수 0
		hex = 0xFF;		//	16진수 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}
}
