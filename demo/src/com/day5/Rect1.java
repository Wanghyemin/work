package com.day5;

import java.util.Scanner;

public class Rect1 {

	String name;
	int score1, score2, tot;

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름?");
		name = sc.next();

		System.out.println("국어?");
		score1 = sc.nextInt();

		System.out.println("영어?");
		score2 = sc.nextInt();

	}

	public int tot() {

		return score1 + score2;

	}

	public void print(int a) {

		System.out.println("총합: " + a);

	}

}
