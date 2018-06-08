package com.javaex.reftype;

public class ArrayMultiDimEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	2차원 배열의 선언
		int[][] twoDimen = new int[5][10];
		
		int table[][] = {
				{1,2,3,4,5,6,7,8,9,0},
				{2,3,4,5,6,7,8,9,0,1},
				{3,4,5,6,7,8,9,0,1,2},
				{4,5,6,7,8,9,0,1,2,3},
				{5,6,7,8,9,0,1,2,3,4}
		};
		
		System.out.println("table.length:" + table.length);	//
		//	table[0] ~ table[table.len
		System.out.println("table[0].length:" + table[0].length);
		
		int sum = 0;
		for(int row = 0; row<table.length;row++) {
			//	table[row], table[row].length
			for(int col = 0; col<table[row].length;col++) {
				System.out.print(table[row][col]+"\t");
				sum += table[row][col];
			}
			System.out.println();
		}
		
		System.out.println("Sum = " + sum);
	}

}
