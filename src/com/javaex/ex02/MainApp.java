package com.javaex.ex02;

public class MainApp {

	public static void main(String[] args) {
		
		//숫자출력 -->출장
		DigitThread dit = new DigitThread();
		dit.start();
		
		//문자출력 -->메인
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
