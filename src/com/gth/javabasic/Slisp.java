package com.gth.javabasic;

public class Slisp {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; // long big  = 100000000000; 
		long hex = 0xFFFF_FFFF_FFFF_FFFFL; //L은 접두사
		
		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c , (int)c);
		System.out.printf("finger=[%5d]%n", finger); //공간 5칸 확보 후 뒤에서부터 출력
		System.out.printf("finger=[%-5d]%n", finger);// 공간 5칸 확보 후 앞에서부터 출력 
		System.out.printf("finger=[%05d]%n", finger); //공간 5칸 확보후 남는 공간엔 0을 나머지공간에 값 출력
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); //#은 접두사 : 0x를 출력해줌.
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
	}
}

