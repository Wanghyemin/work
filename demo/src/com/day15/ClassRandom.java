package com.day15;

import java.util.Random;
import java.util.Scanner;

public class ClassRandom extends Thread {

	private static String[] name = { "�����", "��  ��", "������", "������", "������", "�ڰ���", "������", "�缼��", "��â��", "������", "������",
			"������", "������", "�輺��", "ä����", "������", "������", "�̳���", "���ȯ", "���Ѽ�" };

	private static int[] a;

	public void ClassRandom(String[] name) {
		this.name = name;
	}

	public void input() {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int i, j, inwon, n;
		do {
			System.out.println("��ǥ�� �ο���?");

			inwon = sc.nextInt();

			a = new int[inwon];
		} while (inwon > name.length || inwon < 1);
		
		
		i = 0;
		while (i < inwon) {
			a[i] = rd.nextInt(20);
			for (j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
					break;
				}
			}
			i++;
		}

	}

	@Override
	public void run() {

		System.out.print("������");

		int i = 0;
		while (i < 20) {
			System.out.print(".");
			try {
				sleep(100);

			} catch (Exception e) {

			}
			i++;
		}

	}

	public void print() {

		System.out.println("\n�����մϴ�!! ��ǥ���Դϴ�");
		
		for (int i = 0; i < a.length; i++) {

			System.out.printf("%d�� ��ǥ�� : %s \n", (i + 1), name[a[i]]);
		}
	}

	public static void main(String[] args) {

		ClassRandom cr = new ClassRandom();
		cr.input();
		cr.run();
		cr.print();

	}
}
