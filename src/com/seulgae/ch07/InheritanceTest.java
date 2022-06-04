package com.seulgae.ch07;

class MyPoint{
	int x;
	int y;
}

//class Circle2 extends MyPoint { // 상속
//	int r;
//}

class Circle2 { // 포함
	MyPoint c = new MyPoint(); // 참조변수의 초기화
	int r;
	
//	Circle2(){ // 참조변수의 초기화
//		c = new MyPoint();
//	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle2 c = new Circle2();
		System.out.println(c.toString()); //Circle2@4926097b 문자열 반환
		Circle2 c2 = new Circle2();
		System.out.println(c2); //Circle2@39ed3c8d 문자열 반환
	}
}
