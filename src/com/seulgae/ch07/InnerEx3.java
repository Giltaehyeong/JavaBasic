package com.seulgae.ch07;
class InnerEx3 {
	private int outerIv = 0;
	private static int outerCv = 0;

	class InstanceInner {
		int iiv  = outerIv;  // 1. 외부 클래스의 private 멤버도 접근가능하다.
		int iiv2 = outerCv;
	}

	static class StaticInner {
// static클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}

	void myMethod() {
		//constant pool 상수 : 따로 저장해서 관리하고 있다.
		final int lv = 0; //메서드 종료와 함께 소멸
		final int LV = 0;  // JDK1.8부터 final 생략 가능
//		lv = 3;
		//final 붙어야하는 이유 : 오래 동작할 수 있어서
		class LocalInner {
			int liv = outerIv;// 내부클래스의 객체가 더 오래 존재 가능, 지역 변수보다
			int liv2 = outerCv;
//	2. 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv;	// 에러!!!(JDK1.8부터 에러 아님)
			int liv4 = LV;	// OK
			
			void method() {
				System.out.println(lv);
			}
		}
	}
}
