package com.gth.javabasic;

class Data3 { int x; }

public class Slisp { // 프로그램 실행
	public static void main(String[] args) {
		Data3 d = new Data3(); 
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x =  " + d2.x);
	} 
	
	static Data3 copy(Data3 d) { // 메서드의 반환타입이 참조형이라는 것은 복사한 객체의 주소를 반환한다는 의미로 해석하자.
		Data3 tmp = new Data3(); // 새로운 객체 tmp를 생성한다.
		tmp.x = d.x;  // d.x 의 값을 tmp.x 에 복사한다.
		return tmp; // 복사한 객체의 주소를 반환한다.
	} 
}
