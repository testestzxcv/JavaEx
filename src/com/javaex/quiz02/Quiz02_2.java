package com.javaex.quiz02;

public class Quiz02_2 {
	public static void main(String[] args) {
		int balls = 136;
		int cap = 10;
		
		int box = balls / cap;
		
//		box = box + (balls % cap > 0 ? 1:0);
		box += (balls % cap > 0 ? 1:0);
		
		System.out.println(box);
	}
}
