package com.javaex.basic.var;

public class CharEx {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);;
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);
		//	내부적으로 int 형으로 변환해서 수치 계산 해 버린다
		
		String  str = "A한";
		System.out.println(str);
	}
}
