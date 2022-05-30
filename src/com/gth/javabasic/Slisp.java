package com.gth.javabasic;

class Data2 { int x; }

public class Slisp { // 프로그램 실행
	public static void main(String[] args) { //1. main 메서드 실행 In
		Data2 d2 = new Data2(); // Data2 객체를 생성후 참조변수 d2에 객체 주소값 저장
		d2.x = 10; // 참조변수 x에 10값 대입
		System.out.println("main() : x = " + d2.x); //2. println 메서드 In 3. 콘솔창 출력시 out
		
		change(d2); //메서드 호출, 호출한 곳으로 돌아와서
		System.out.println("After change(d)"); // 7. println 메서드 In 8. 콘솔창 출력시 out
		System.out.println("main() : x = " + d2.x); // 9. println 메서드 In 10. 콘솔창 출력시 out
	} //main 메서드 종료
	
	static void change(Data2 d2) { //4. change 메서드 실행 In
		d2.x = 1000; // 참조변수 x에 1000값 대입
		System.out.println("change() : " + d2.x); //5. println 메서드 In 6. 콘솔창 출력시 out
	} //메서드 종료, 참조변수 x값은 변경되어 있다.
}
