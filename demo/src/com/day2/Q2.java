package com.day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("number?");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b) {
			System.out.printf("큰 숫자: %d, 작은 숫자: %d", a, b);
		} else {
			System.out.printf("큰 숫자: %d, 작은 숫자: %d", b, a);
		}

	}

}
