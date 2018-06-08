package com.javaex.collection.hash;

import java.util.HashSet;

class SimpleNum{
	int num;
	
	public SimpleNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	//	hashCode, equals를 오버라이드
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNum) {
			SimpleNum other = (SimpleNum)obj;
			return num == other.num;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return num;
//		return num % 6;
	}
	

	
}

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<SimpleNum> hs = new HashSet<>();
		
		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		int h1 = s1.hashCode();
		int h2 = s1.hashCode();
		int h3 = s1.hashCode();
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		System.out.println(hs);
		System.out.println(s2.equals(s3));
	}

}
