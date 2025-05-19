package com.javaex.ex03;

public class LowerThread extends Thread {

	// 소문자
	public void run() {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}