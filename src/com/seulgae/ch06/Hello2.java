package com.seulgae.ch06;
//하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직
//public class Hello2 {} // 소스파일의 이름은 public class 이름과 일치, public class가 없는 경우에는 상관없음
class hello2{}
class Hello3 {
	public static void main(String[] args) { // 소스파일명과 클래스 이름이 다를 경우 컴파일러가 알아서 아무거나 실행시킴.
		System.out.println("hello");
		System.out.println("실습 타이틀 변경하기");
	}
}
/*
public class Hello3 {} // 하나의 소스파일에는 하나의 public class만 허용
//The public type Hello3 must be defined in its own file
 */
class Hello4 {}
