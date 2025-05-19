package com.javaex.ex05;

public class MainAPp {

	public static void main(String[] args) {
		
		//Runnable 만들고
		Runnable dt = new Digitimpl(); //run 로직(숫자출력)로직
		
		
		
		//숫자 출장
		Thread t = new Thread(dt);  //생성자 파라미터로 
		t.start();
		
		
		
		//대문자 메인
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}

}
}