package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int area, width, height;

		System.out.print("�غ�?");
		width = Integer.parseInt(br.readLine());

		System.out.print("����?");
		height = Integer.parseInt(br.readLine());

		area = width * height / 2;

		System.out.println("�غ�: " + width);
		System.out.println("����: " + height);
		System.out.println("����: " + area);

	}

}
