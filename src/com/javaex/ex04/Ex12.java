package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("=================");
		
		
		for(int i=1; i<=10; i++) {
			
			if(i==6) {
				//아무것도 안함
			}else {
				System.out.println(i);
			}
			
		}
		
		System.out.println("=================");
		for(int i=1; i<=10; i++) {
			
			if( i != 6 ) {
				System.out.println(i);
			}
			
		}
		
	}

}
