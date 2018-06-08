package com.javaex.quiz.quiz01;

public class Quiz01_4 {
	public static void main(String[] args) {
		byte b = 10;	// 1바이트
		char ch = 'A';	// 2바이트
		int i = 100;	// 4바이트
		long l = 1000L;	// 8바이트
		
		byte b2 = (byte)i;		//	4바이트 -> 1바이트
		char ch2 = (char)b;		//	byte 1바이트 -> char 2바이트
		short s = (short)ch;	//	unsigned 2바이트 ->	2바이트
		float f = l;		//	8바이트 -> 4바이트	<-
		int i2 = ch;		// 	2바이트 -> 4바이트	<-
	}
}
