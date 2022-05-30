package com.gth.javabasic;

class Data { int x; }

public class Slisp { // 프로그램 실행
	public static void main(String[] args) { //1. main 메서드 실행 In
		Data d = new Data(); // 객체 생성
		d.x = 10; // 객체 참조변수 x변수에 10대입
		System.out.println("main() : x= " + d.x); //2. println 메서드 실행 In , 3. 콘솔 출력시 out
		
		change(d.x); //chagne 메서드 호출, 호출한곳으로 되돌아옴.
		System.out.println("After change(d.x)"); //8. println 메서드 실행 In , 3. 콘솔 출력시 out
		System.out.println("main() : x = "+ d.x); //9.  println 메서드 실행 In , 3. 콘솔 출력시 out
	} // 프로그램 종료
	
	static void change(int x) { //5. change 메서드 실행
		x = 1000; // 지역변수 x변수에 1000대입
		System.out.println("change() : x = " + x); //6. println 메서드 실행 In, 7. 콘솔 출력시 out
	} //메서드 종료, 지역변수 ㅃㅇ
}
