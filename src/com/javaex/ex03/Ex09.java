package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목번호를 입력하세요");
		System.out.print("과목번호:");
		
		int code = sc.nextInt();
		
		if(code==1) {//과목코드 1일때
			System.out.println("R101");
		
		}else if(code==2) {//과목코드 2일때
			System.out.println("R202");
		
		}else if(code==3) {//과목코드 3일때
			System.out.println("R303");
		
		}else if(code==4) {//과목코드 4일때
			System.out.println("R404");
			
		}else {
			System.out.println("상담원");
		}
		
		sc.close();

	}

}
