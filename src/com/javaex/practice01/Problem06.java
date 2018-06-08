package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		int sum=0;
		
		if(num%2==0) {
			for(int i=0;i<=num;i+=2) {
				sum+=i;
			}
		}else {
			for(int j=1;j<=num;j+=2) {
				sum+=j;
			}
		}
		
		System.out.println("결과값: " + sum);
		scanner.close();
	}
}
