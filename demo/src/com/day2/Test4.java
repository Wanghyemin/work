package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// ���,�ݺ���
		// if, for, while, do~while, switch
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su;
		String str = null;

		System.out.print("�� �Է�?");
		su = Integer.parseInt(br.readLine());

		// ���� if�� (����)
		if (su % 2 == 0) {
			str = "¦��";
		}
		if (su % 2 != 0) {
			str = "Ȧ��";
		}
		System.out.println(su + ": " + str);

		// if, else��
		if (su % 2 == 0) {
			str = "¦��";
		} else {
			str = "Ȧ��";
		}
		System.out.println(su + ": " + str);
		
	}
	
}
