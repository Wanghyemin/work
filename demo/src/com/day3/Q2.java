package com.day3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

/*		1에서 100까지의 수중 3의 배수의 갯수
		3의 배수의 개수 : 33*/
		
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		j = 0;
		
		System.out.println("숫자를 입력하세요");
		i = sc.nextInt();
		
		if (i%3==0) {
			j=j+1;
		}

		System.out.println("3의 배수의 개수 : " + j);
		
		
		
		
		
		
	}

}
