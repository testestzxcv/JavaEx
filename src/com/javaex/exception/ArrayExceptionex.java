package com.javaex.exception;

public class ArrayExceptionex {

	public static void main(String[] args) {
		int[] intArray = new int[] {3,6,9};
		
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Error:" + e.getMessage());
//			System.out.println("Error:" + e.getStackTrace());
		}
		

	}

}
