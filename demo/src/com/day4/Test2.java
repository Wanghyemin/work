package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 년,월,일
		// 2021년 12월 27일 월요일

		Scanner sc = new Scanner(System.in);

		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] yoil = { "일", "월", "화", "수", "목", "금", "토" };
		int y, m, d, nalsu, week;

		do {
			System.out.print("년도?");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("월?");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			months[1] = 29;
		}

		do {
			System.out.print("일?");
			d = sc.nextInt();
		} while (d < 1 || d > months[m - 1]);

		nalsu = 365 * (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		for (int i = 0; i < m - 1; i++) {
			nalsu += months[i];
		}

		nalsu += d;

		week = nalsu % 7;

		System.out.printf("%d년 %d월 %d일 %s요일", y, m, d, yoil[week]);
		
	/*
	 * switch (week) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		}
*/
	}

}
