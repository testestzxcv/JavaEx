package com.javaex.practice01;

public class Problem04 {
	public static void main(String[] args) {
		int startnum=1, endnum=11;
		
		for(int start=0;start<10;start++) {
			for(int next = start+1; next<endnum; next++) {
				System.out.print(next+"\t");
			}
			endnum++;
			System.out.println();
		}
	}
}
