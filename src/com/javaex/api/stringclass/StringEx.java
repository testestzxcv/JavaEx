package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		String s1 = "Java";	//	리터럴
		String s2 = new String("Java");	//	메모리에 새로 만들기
		String s3 = "Java";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		//	String 생성자
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		
		//	valueOf 메서드
		String s5 = String.valueOf(3.14159f);
		
		//	유용한 메서드들
		String str = "Java Programming is Fun?";
		System.out.println(str.charAt(5));	//	5번 인덱스의 char
		System.out.println(str.indexOf("Fun"));
		System.out.println(str.indexOf("fun"));
		
		//	replace
		System.out.println(str.replace('?', '!'));
		System.out.println(str.replaceAll("Fun", "Funny"));
		
		System.out.println(str);
		
		String s6 = "			Hello			";
		String s7 = ", Java";
		
		s6 = s6.trim();	//	Whitespace 날리기
		System.out.println(s6 + s7);
		
		//	문자열 분리 : split();
		String[] split = str.split(" ");
		System.out.println(split);
		
		for(String data:split) {
			System.out.println(data);
		}
		
	}

}
