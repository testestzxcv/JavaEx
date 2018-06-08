package com.javaex.oop.point.v4;

public class Point {
	protected int x;
	protected int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this();	//	자기 자신의 다른 생성자
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
	
	//	메서드 오버로딩
	public void draw(boolean show) {
		String message = String.format("점[x=%d, y=%d]을 ", x,y);
		if(show) {
			message += "그렸습니다.";
		}else {
			message += "지웠습니다.";
		}
		
		System.out.println(message);
	}
}
