package com.lec.condition;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int jumsu = scanner.nextInt();
		if(jumsu>=90 && jumsu <=100) {  // &&�������� ������ false�� ��� ���� ���� �� ��  , ||�������� ������ true�� ��� ���� ���� �� ��
			System.out.println("a");
		}else if(jumsu>=80 && jumsu<90) {
			System.out.println("b");
		}else if(jumsu>=70 && jumsu<80) {
			System.out.println("c");
		}else if(jumsu>=60 && jumsu<70) {
			System.out.println("d");
		}else if(jumsu>=0 && jumsu<60) {
			System.out.println("f");
		}else {
			System.out.println("����");
		}
		scanner.close();
	}
}
