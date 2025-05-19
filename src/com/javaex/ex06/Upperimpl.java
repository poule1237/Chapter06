package com.javaex.ex06;

public class Upperimpl implements Runnable{

	
	public void run() {
			for(char up='A'; up<='Z'; up++) {
				System.out.println(up);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		
	}

	
}
