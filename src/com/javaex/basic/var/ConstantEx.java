package com.javaex.basic.var;

public class ConstantEx {
	static final double PI = 3.14159;
	final static int SPEED_LIMIT = 110;
	
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		//	상수 변경 시도
//		SPEED_LIMIT = 120;
		//	final이어서 변경은 불가함
	}
}
