package com.day2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int a, b, c, d;
		String name, e;

		System.out.print("이름?");
		name = sc.next();

		System.out.print("점수?");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		d = a + b + c;

		if (d >= 180) {
			e = a >= 40 && b >= 40 && c >= 40 ? "합격" : "과락";
		} else {
			e = "불합격";
		}

		System.out.println("이름: " + name + "\n총점: " + d + ", 평균: " + d / 3 + ", 판정: " + e);

	}

}
