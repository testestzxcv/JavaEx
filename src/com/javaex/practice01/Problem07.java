package com.javaex.practice01;

import java.util.Random;
import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);;
		
		int init;
		int select = 0;
		String choice = "Y";
		
		while(true) {
			init = r.nextInt(100);
			do {
				System.out.println(">>");
				
				select = scanner.nextInt();
				
				if(select < init) {
					System.out.println("더 높게");
				}else if(select > init){
					System.out.println("더 낮게");
				}else if(select == init){
					System.out.println("맞았습니다.");
					break;
				}else {
					System.out.println("다시 입력하세요.");
				}
			}while(true);
			
			System.out.println("게임을 종료하시겠습니까?(y/n)");
			
			choice = scanner.next();
			
			if(choice.equals("n")||choice.equals("N")) {
				continue;
			}else if(choice.equals("y")||choice.equals("Y")) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		System.out.println("===================");
		System.out.println("   [숫자맞추기게임 종료]   ");
		System.out.println("===================");
	}
}
