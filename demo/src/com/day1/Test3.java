package com.day1;

public class Test3 {

	public static void main(String[] args) {
		
		int r=10; 
		float area,lenght ; // 실수형 변수
		
		area = r*r*3.14f;
		lenght = r*2*3.14f;
				
		System.out.println(area);
		System.out.println(lenght);
		
		System.out.println("반지름: " + r + ", 면적: " + area);
		
		System.out.printf("반지름: %d, 면적: %.2f",r,area);
 


	}
	

}
