package com.lec.condition;

import java.util.Scanner;

//  ����ڷκ��� ����(0) , ���� (1) , �� (2) �� �Է¹ް�,
//  ��ǻ�͵� ����(0) , ���� (1) , �� (2) �� �ϳ��� �����ؼ� ����ϱ�
public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) �� �ϳ��� ���� :");
		int you = scanner.nextInt();
		if(you==0) {
			System.out.println("������ ���̳�");
		}else if (you==1) {
			System.out.println("������ ���̳�");
		}else if(you==2) {
			System.out.println("���� ���̳�");
		}else {
			System.out.println("�̴�!");
		}
		scanner.close();
		int computer = (int)(Math.random()*3);   //��ǻ�Ͱ� �������ִ� �������� �������� ���ϴ�
		if(computer==0) {
			System.out.println("���� ������");
		}else if(computer==1) {
			System.out.println("���� ������");
		}else {
			System.out.println("���� ����");
		}
		if((you +2 )%3 == computer) {
			System.out.println("����� �̰��");
		}else if(you==computer) {
			System.out.println("����");
		}else {
			System.out.println("��ǻ�Ͱ� �̰��");
		}
		//Math.random() 0���� 1���� ���� �Ǽ� ������ �߻�
		//System.out.println(Math.random()*3); //0 ~ 2.99999999999999 ���� �Ѿ���ʴ´� ����Ŭ�� �׷����� ��;
		//System.out.println( (int) (Math.random()*3));   ��ǻ�ͺ��� ã�����ϸ� �������̴�.
		if(you==0) {    //���� ���� �ٽ��ؾ���
			if(computer==0) {
				System.out.println("����");
			}else if(computer==1) {
				System.out.println("��ǻ�Ͱ� �¸�");
			}else {
				System.out.println("��ǻ�Ͱ� ");
			}
		}//you if��
	}//main �Լ�
}//class