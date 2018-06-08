package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int select;
		int credit=0, withdraw=0, balance=0, exit;
		boolean roop = true;
		
		do {
			System.out.println("------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------");
			System.out.println("선택>");
			select = scanner.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("예금액>");
				credit = scanner.nextInt();
				balance += credit;
				
				break;
			case 2:
				System.out.println("출금액>");
				withdraw = scanner.nextInt();
				balance -= withdraw;
				break;
			case 3:
				System.out.println("잔고액>"+balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				roop = false;
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}while(roop);
	}
}
