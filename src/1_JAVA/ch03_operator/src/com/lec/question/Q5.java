package com.lec.question;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		int kor = sc.nextInt();
		System.out.println("����");
		int eng =sc.nextInt();
		System.out.println("����");
		int mat =sc.nextInt();
		int tot = kor + eng + mat;
		// (double)tot /3
		double avg = tot / 3.0;
		System.out.printf("���� : %3d\n", kor);
		System.out.printf("���� : %3d\n", eng);
		System.out.printf("���� : ");
		System.out.printf("���� : %d\t��� : %.2f\n", tot , avg);
		sc.close();
	}
}