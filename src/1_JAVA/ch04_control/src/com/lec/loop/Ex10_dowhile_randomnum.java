package com.lec.loop;

import java.util.Scanner;

public class Ex10_dowhile_randomnum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lotto = (int)(int)(Math.random()*45)+1; //��ǻ�� �ζ� ����
		int su; // ����ڿ��� �Է¹��� ���� �����ϴ� ����
		do {
			System.out.print("�ζ� ��ȣ �Ѱ��� �˾Ƹ��� ������");
			su = scanner.nextInt();
			if(su>lotto) {
				System.out.println(su+"���� ���� ���� �����ϼ���");
			}else if(su<lotto) {  //���� �ڿ� ������ �־���� �ȱ׷� ���� �ϳ� ����
				System.out.println(su+"���� ū ���� �����ϼ���");
			}
		}while(su!=lotto);
		System.out.println("��ũ�����߷��̼�");
//		System.out.println(Math.random());//  <--0���� 1�̸��� ���� �Ǽ� �� �߻���Ű�� ���
//		System.out.println(Math.random()*45); // ()*10); <-0�̻� 10�̸��� ����
//		System.out.println((int)(Math.random()*45)); // 0~44������ ���� ����
//		System.out.println((int)(Math.random()*45)+1); //1~45������ ���� ����
	}
}
