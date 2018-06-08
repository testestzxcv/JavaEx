package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		
		System.out.println("숫자를 입력하세요.");
		
		for(int i=0;i<5;i++) {
			System.out.println("숫자: ");
			int tmp = scanner.nextInt();
			if(tmp>max) {
				max = tmp;
			}
		}
		
		System.out.println("최대값은 " + max + "입니다.");
	}
}
