package com.seulgae.ch06;

public class printGugudan {

	void printGugudan(int dan) {
		if(!(2 <= dan && dan <= 9))
			return; //dan의 값이 2~9가 아닌경우, 호출한 곳으로 그냥 되돌아간다.
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d%n", dan, i, dan*i);
		}
		return; // 반환 타입이 void이므로 생략가능. 컴파일러가 자동추가
	}
	
	public static void main(String[] args) {
		printGugudan dan = new printGugudan();
		dan.printGugudan(3);
	}
}
