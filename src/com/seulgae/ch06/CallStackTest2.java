package com.seulgae.ch06;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstmethod(); // static 메서드는 객체 생성없이 호출 가능하다.
		System.out.println("main(String[] args)이 끝났음.");
	}
	
	static void firstmethod() {
		System.out.println("firstmethod()이 시작되었음.");
		secondMethod();
		System.out.println("firstmethod()이 끝났음.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}
}
