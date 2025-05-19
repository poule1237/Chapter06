package com.javaex.ex03;

public class UpperThread extends Thread {

	// 대문자
	public void run() {
		for (char up = 'A'; up <= 'Z'; up++) {
			System.out.println(up);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
