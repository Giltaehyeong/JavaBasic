package com.seulgae.ch06;

import java.util.Scanner;

public class recursiveCall {

//	static void  method(int n) {
//		while(n>0) {
//			System.out.println(n);
//			method(--n);
//		}
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수하나를 입력해주세요 : ");
		int num = scan.nextInt();
//		method(num);
		while(num > 0) {
			System.out.println(num);
			num--;
		}
	}
}
