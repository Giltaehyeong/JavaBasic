//package com.seulgae.ch06;
//
//class MyMath5{
//	long a, b; //iv
//	// 1. 그래서 iv와 im을 사용하기 위해서
//	
//	long add() { //인스턴스 메서드
//		return a + b;
//	}
//	
//	static long add(long a, long b) { // 클래스 메서드(static메서드)
//		return a + b;
//	}
//}
//
//public class staticInstance {
//	public static void main(String[] args) {
//		System.out.println(MyMath5.add(3, 5)); // static 메서드 객체 생성없이 사용가능
//		                                                              // static 메서드를 언제 쓴다고? iv를 사용하지 않을때
//		MyMath5 obj = new MyMath5();
//		//2. 객체를 생성한다.
//		obj.a = 100L;
//		obj.b = 200L;
//		//3. 주소가 가르키는 곳에 값을 넣고
//		System.out.println(obj.add()); //4. 인스턴스메서드 호출
//	}
//}
//
//class TestClass2{
//	int iv; //인스턴스 변수
//	static int cv; // 클래스 변수
//	
//	void instanceMethod() { // 인스턴스 메서드
//		System.out.println(iv); // 인스턴스 변수를 사용할 수 있다.
//		System.out.println(cv); // 클래스 변수를 사용할 수 있다.
//	}
//	
//	static void staticMethod() {
//		System.out.println(iv); //에러 !! 인스턴스 변수를 사용할 수 없다.
//		                                   //Cannot make a static reference to the non-static field iv
//		System.out.println(cv); // 클래스 변수는 사용할 수 있다.
//	}
//}
//
//class TestClass{
//	void instanceMethod() {} // 인스턴스 메서드
//	static void staticMethod() {} // static 메서드
//	
//	void instanceMethod2() { // 인스턴스 메서드
//		instanceMethod(); // 다른 인스턴스 메서드를 호출한다.
//		staticMethod(); // static 메서드를 호출한다.
//	}
//	
//	static void staticMethod2() {
//		instanceMethod(); // 에러!! 인스턴스메서드를 호출할 수 없다.
//									// Cannot make a static reference to the non-static method instanceMethod() from the type TestClass
//		staticMethod(); // static 메서드는 호출할 수 있다.
//	}
//}