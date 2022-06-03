package com.seulgae.ch06;

public class multiply {
	int multiply(int x, int y) {
		max(x, y);
		int result = x * y;
		return result; // 반환 타입이 void가 아니므로 생략불가
	}

	int max(int a, int b) {
		if(a > b)
			return a; // 조건식이 참일 때만 실행된다.
		else
			return b;
	}
	
	public static void main(String[] args) {
		multiply m = new multiply();
		int result = m.multiply(3, 5);
		System.out.println(result);
	}
}
