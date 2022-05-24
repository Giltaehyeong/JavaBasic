package com.gth.javabasic;

class Tv{ ; //1. 클래스생성(설계도)
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널

	// 2. 객체 생성(제품의 기능을 생성한다.)
	void power() { power = !power; } // TV를 켜거나 끄는 기능을 하는 메서드
	void vhannelUp() { ++channel; } // TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; } // TV의 채널을 낮추는 기능을 하는 메서드
	
}

public class Slisp {
	public static void main(String[] args) {
		Tv t;  // Tv인스턴스를 참조하기 위한 변수, t를 선언
		t = new Tv(); // Tv 인스턴스를 생성한다.
		t.channel = 7; // Tv 인스턴스의 멤버변수 channel의 값을 7로한다.
		// 3. 객체 사용(제품의 기능을 사용한다.)
		t.channelDown(); // Tv 인스턴스의 메서드 channelDown을 호출한다.
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}
}

