package com.javaex.ex03;

public class MainApp {

	public static void main(String[] args) {

		// 쓰래드 생성
		Thread t01 = new DigitThread();
		Thread t02 = new LowerThread();
		Thread t03 = new UpperThread();

		// 쓰래드실행
		t01.start();
		t02.start();
		t03.start();

		// 3개 동시에 출력되어야한다

	}

}
