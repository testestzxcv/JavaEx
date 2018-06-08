package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum=0;
		
		for(int i=0;i<5;i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		
		System.out.printf("평균은 %.1f 입니다.%n",(double)sum/5);
	}
}
