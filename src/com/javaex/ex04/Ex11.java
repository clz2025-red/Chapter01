package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		/*
		for(int i=1; i<=10; i++) {
		
			if(i%2==0 && i%3==0) {
				break;   //가장가까운 반복문을 나간다
			}
			
			System.out.println(i);
			
		}
		*/

		for(int i=1; i<=10; i++) {
			
			if(i%2==0 && i%3==0) {
				continue;   //이번 회차의 나머지일을 하지 않는다
			}
			
			System.out.println(i);
		}


	}

}
