package com.javaex.oop.point.v2;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
//		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x,y);
	}
}
