package com.lec.loop;

import java.util.Scanner;

public class Ex09_dowhile {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int num;
		do {
			System.out.print("¦���� �Է��ϼ��� : ");
			num = scanner.nextInt(); // ����ڷκ��� �Է¹��� ���� num �Ҵ�  //��Ͼȿ� ���� �ϸ� ��Ͼȿ��� ���ö� ������� ��������
		}while(num%2 == 1 || num%2== -1);/*num�� Ȧ����*/ //||�����ڴ� ���߿� �ϳ� �´��� �ƴ��� Ȯ���� ������ ��Ʈ���� ���� �ٶ�.
		System.out.println("�Է��Ͻ� ¦����"+num);
	}
}
