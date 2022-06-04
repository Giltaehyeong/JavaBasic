package com.seulgae.ch07;

class MyPoint3 extends Object{
	int x;
	int y;
	
	//생성자 : 인스턴스 초기화 메서드
	MyPoint3(int x, int y){
		this.x = x;
		// this가 붙으면 매개변수에 x가아닌 바로 위 인스턴스 메서드를 가르킨다.
		// 변수이름이 같아서 혼동하지 말자.
		this.y = y;
	}
	
	// Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:"+x+", y:" +y;
	}
}
/*
class MyPoint3D extends MyPoint3{
	int z;
	
	// 조상의 getLocation()을 오버라이딩
	// 오버라이딩은 상속받는 부모의 메서드 내용을 변경하는 것
	String getLocation() {
		return "x:"+x+", y:" +y+", z:"+z;
	}
}
*/

public class OverrideTest {
	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3(3, 5);
		System.out.println(p);
		
//		MyPoint3 p = new MyPoint3();
//		p.x = 3;
//		p.y = 5;
//		System.out.println(p.toString());
//		System.out.println("p.x="+p.x);
//		System.out.println("p.y="+p.y);
	}
}
