package com.day16;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos;
			PrintStream ps;

			fos = new FileOutputStream("d:\\doc\\out5.txt");
			ps = new PrintStream(fos);

			ps.println("�̼���");
			ps.println("ȫ�浿");
			ps.println("����");

			ps.close();
			fos.close();

			fos = new FileOutputStream("d:\\doc\\out5.txt", true); // true : �����ض�
			ps = new PrintStream(fos);

			ps.println("��");
			ps.println("��");
			ps.println("��"); // �������

			ps.close();
			fos.close();

		} catch (Exception e) {
	
		}

	}

}
