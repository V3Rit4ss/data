package com.lec.loop;

import java.util.Scanner;

public class Ex10_dowhile_lotto { // ������ ���� ī���� �ڹ� ����. 12-02
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lotto = (int)(int)(Math.random()*45)+1; //��ǻ�� �ζ� ����
		int su; // ����ڿ��� �Է¹��� ���� �����ϴ� ����
		int min = 1 ;
		int max = 45 ;
		do {
			System.out.printf("%d���� %d���� �ζ� ��ȣ �Ѱ��� �˾Ƹ��� ������" , min, max);
			su = scanner.nextInt();
			if(su>lotto) {
				System.out.println(su+"���� ���� ���� �����ϼ���");
				max = su-1;
			}else if(su<lotto) {  //���� �ڿ� ������ �־���� �ȱ׷� ���� �ϳ� ����
				System.out.println(su+"���� ū ���� �����ϼ���");
				min = su-1;
			}
		}while(su!=lotto);
		System.out.println("��ũ�����߷��̼�");
//		System.out.println(Math.random());//  <--0���� 1�̸��� ���� �Ǽ� �� �߻���Ű�� ���
//		System.out.println(Math.random()*45); // ()*10); <-0�̻� 10�̸��� ����
//		System.out.println((int)(Math.random()*45)); // 0~44������ ���� ����
//		System.out.println((int)(Math.random()*45)+1); //1~45������ ���� ����
	}
}
