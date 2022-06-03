package com.seulgae.ch06;

public class MyMathTest {

	public static void main(String[] args) {
		// 2. MyMath 객체생성
		MyMath mm = new MyMath();
		// 3. MyMath 객체 사용(객체의 메서드 호출)
		
		long result1 = mm.add(5L, 3L); // add 메서드 호출, 작업을 마치면 호출한 곳으로 돌아옴, result1 에 8을 저장함.
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		// double대신 long값으로 호출하였다. 이 값은 double로 자동형변환 된다.
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.Max(3L, 5L);
		mm.printGugudan(0); //구구단 3단을 출력

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("Max(5L, 3L) = " + result5);
	}
}

// 1. MyMath클래스 작성(메서드 작성)
class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan <= 9))
			return; // 입력받은 단(dan)이 2 ~ 9가 아니면, 메서드 종료하고 돌아가기
		
		for (int i = 0; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		
//		return; //생략가능
	}
	
	long add(long a, long b) {
//		long result = a + b; // 5, 3
//		return result; // 8
		return a+b; //위의 두줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	// 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	long Max(long a, long b) {
		if(a>b) 
			return a; // 조건식이 참일때만 실행
		else
			return b; // 조건식이 거짓일 때 실행
//		else
//			return b;
//		return a > b ? a : b;
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
}
