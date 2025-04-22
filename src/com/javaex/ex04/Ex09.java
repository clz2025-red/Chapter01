package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		/*
		int no = 1;
		
		while(true) {
			if(no%6==0 && no%14==0) {
				break;
			}
			
			System.out.println("현재:" + no );
			no++;
		}
		
		System.out.println("정답" + no);
		*/
		/////////////////////////////////////
		int no = 0;
		
		boolean action = true;
		
		while(action) {
			if(no%6==0 && no%14==0) {
				action=false;   //로직을 유지하면서 반복문을 탈출할수 있다
			}
			
			//이부분이 추가로 작동한다(똑같지 않다)
			System.out.println("현재:" + no );
			no++;
		}
		
		System.out.println("정답" + no);
		
		
	}
	
}
