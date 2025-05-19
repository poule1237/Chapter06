package com.javaex.ex05;
//이미 상송받은게 있어서 Thread 를 상속 받을 수 없을때
//public class DigitThread extends Shape{


public class Digitimpl implements Runnable {

	
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
