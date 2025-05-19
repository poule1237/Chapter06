package com.javaex.ex03;

public class DigitThread extends Thread {

	// 숫자출력
	public void run() {

		for (int i = 0; i < 30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
