package com.seulgae.pkg2;

import com.seulgae.pkg1.MyParent; //ctrl + shift + o

class MyChild extends MyParent{
	public void printMembers() {
//		System.out.println(prv); //에러, 패키지 벗어나서.
//		System.out.println(dft); //에러, 패키지 벗어나서.
		System.out.println(prt); //OK, 다른패키지 더라도 자손은 허락
		System.out.println(pub); //OK
	}
}


public class MyParentTest2{
	public static void main(String[] args) {
		
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러. 접근범위가 안맞음
//		System.out.println(p.dft); //에러 접근범위가 안맞음
//		System.out.println(p.prt); //에러 접근범위가 안맞음
		System.out.println(p.pub); //OK
	}
}
