package com.gth.javabasic;

public class Slisp {

	public static void main(String[] args) {
		int a = 1;
		int b = 13;
		int temp = 0;
		
		System.out.println(a);
		System.out.println(b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
		
		final int WIDTH = 20; //폭
		final int HEIGHT = 10; //높이
		
		//상수 사용예제
		int triangleArea = (WIDTH * HEIGHT) / 2; // 삼각형의 면적을 구하는 공식
		int rectangleArea = WIDTH * HEIGHT; // 사각형의 면적을 구하는 공식
		
		System.out.println(triangleArea);
		System.out.println(rectangleArea);
		
		char ch = 'J'; //문자 리터널
		String name = "Java"; // 변수 name에 문자열 리터널 "Java"를 저장
	}
}

