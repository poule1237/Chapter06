package com.javaex.ex06;

public class MainApp {

	public static void main(String[] args) {
		
		Runnable dt = new Digitimpl();
		Runnable ut = new Upperimpl();
		Runnable lt = new Lowerimpl();
		
		//숫자 출력
		Thread t01 = new Thread(dt);
		t01.start();
		//대문자출력
		Thread t02 = new Thread(ut);
		t02.start();
		//소문자출력
		Thread t03 = new Thread(lt);
		t03.start();

	}

}
