package com.seulgae.ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstmethod(); // static 메서드는 객체 생성없이 호출 가능하다.
	}
	
	static void firstmethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
