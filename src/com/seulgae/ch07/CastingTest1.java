package com.seulgae.ch07;
class CastingTest1 {
	public static void main(String args[]) {
		Car c = new Car(); // Car 멤버가 4개이다. water()가 없다.
		FireEngine fe = (FireEngine)c; // 실제 가르키는 인스턴스가 중요하다.
		// 가르키는 인스턴스의 멤버 개수를 넘어가면 안된다!!
		fe.water(); // 컴파일 오케이, 형변환 실행 에러 java.lang.ClassCastException
	}
}

class Car {
	String color;
	int door;

	void drive() { 		// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {		// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}
