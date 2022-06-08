package com.seulgae.ch07;

abstract class Player { // 추상 클래스(미완성 클래스, 미완성 설계도)
	abstract void play(int pos); // 추상 메서드
	abstract void stop(); // 추상 메서드(선언부만 있고 구현부{}가 없는 메서드)
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+"위치부터 play합니다."); } 
	void stop() {System.out.println("재생을 멈춥니다."); }
}

/*
abstract class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+"위치부터 play합니다."); } 
//	void stop() {System.out.println("재생을 멈춥니다."); }
// The type AudioPlayer must implement the inherited abstract method Player.stop()
// 추상메서드의 일부만 구현한 경우 키워드를 붙여주어야 한다. 왜? 추상 메서드가 있는걸 알려줘야 되서.
}
*/

public class PlayerTest {
	public static void main(String[] args) {
//		Player p = new Player(); // 추상 클래스의 객체를 생성
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); // 다형성 
		//리모콘 -> play(), stop()
		ap.play(100);
		ap.stop();
	}
}
