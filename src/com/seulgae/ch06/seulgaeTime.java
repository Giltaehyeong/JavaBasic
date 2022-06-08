package com.seulgae.ch06;

public class seulgaeTime {
	private int hour;
	private int minute;
	private double second;
	
	public int getHour() { return hour; }
	public int getminute() { return minute; }
	public double getSecond() { return second; }
	
	public void setHour(int h) {
		if(h < 0 || h > 23)return;
		hour = h;
	}
	
	public void setMinute(int m) {
		if(m < 0 || m > 59) return;
		minute = m;
	}
	
	public void setSecond(double s) {
		if(s < 0 || s > 59) return;
		second = s;
	}
	
	
	public static void main(String[] args) {
		seulgaeTime t = new seulgaeTime();
		t.setHour(5);
		t.setMinute(90);
		t.setSecond(10.5);
		System.out.printf("%d시 %d분 %f 초 입니다.", t.hour, t.minute, t.second);
	}

}
