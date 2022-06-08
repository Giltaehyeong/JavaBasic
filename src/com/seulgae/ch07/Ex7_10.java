package com.seulgae.ch07;

public class Ex7_10 {
	public static void main(String[] args) {
//		Unit3[] group = { new Marine2(), new Tank2(), new Dropship2() };
		Unit3[] group = new Unit3[3]; // 객체배열 : 참조변수 묶음은 것
//		Object[] group = new Unit3[3]; // 리모콘 타입이, 참조변수 타입이 Object
		group[0] = new Marine2();
		group[1] = new Tank2();
		group[2] = new Dropship2();

		// group의 타입은 Unit[], group[0], group[1], group[2]의 타입은 Unit
		// Object엔 move라는 단추가 없다.
		group[0].move(100, 200); // Marine2 객체의 move(100, 200)을 호출
		group[1].move(100, 200); // Tank2 객체의 move(100, 200)을 호출
		group[2].move(100, 200); // Dropship2 객체의 move(100, 200)을 호출
	}
}

abstract class Unit3 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine2 extends Unit3 { // 보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank2 extends Unit3 { // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship2 extends Unit3 { // 수송선
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}