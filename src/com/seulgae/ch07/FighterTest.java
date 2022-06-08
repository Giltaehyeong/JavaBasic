package com.seulgae.ch07;
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable{ // 인터페이스의 모든 메서드는 public abstract. 예외없이
	void move(int x, int y);  //public abstract가 생략됨.
	void attack(Fightable f); //public abstract가 생략됨.
}

class Fighter extends Unit implements Fightable{
	// 오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안된다.
	public void move(int x, int y) { // public 안붙이면 default.. 좁아서 오류남.. 그래서 꼭 붙여줘야되 public
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	// 싸울 수 있는 상대를 불러온다.
	Fightable getFightable(){
		Fighter f = new Fighter(); // Fighter를 생성해서 반환
		return f; //
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		
		/*
		Unit u = new Fighter();
		Fightable f = new Fighter();
		u.move(100, 200);
//		u.attack(new Fighter());  // Unit2에는 attack()이 없어서 호출불가
		u.stop();
		
		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); // Fightable에는 stop()이 없어서 호출불가
		 */
	}
}