package com.lec.condition;

import java.util.Scanner;

public class Q6 { //�ð�(�� , ��)�� ����ڰ� �޴°� �ƴ϶� �ý��ۿ��� �޾ƾ��Ѵ�. �װ� api ���Ƕ� 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �� �� �ΰ��� ?");
		int month = scanner.nextInt();
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("�Է��Ͻ� ������ �ܿ��̱���"); break;
		case 3: case 4: case 5:
			System.out.println("�Է��Ͻ� ������ ���̱���"); break;
		case 6: case 7: case 8:
			System.out.println("�Է��Ͻ� ������ �����̱���"); break;
		case 9: case 10: case 11:
			System.out.println("�Է��Ͻ� ������ �����̱���"); break;
		default:
			System.out.println("��Ȯ�� ���� �Է����ּ���");
		}
		if(month==12 || month==1 || month==2) {
			System.out.println("�Է��Ͻ� ������ �ܿ��̱���");
		}else if(month==3 || month==4 || month==5) {
			System.out.println("�Է��Ͻ� ������ ���̱���");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("�Է��Ͻ� ������ �����̱���");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("�Է��Ͻ� ������ �����̱���");
		}else {
			System.out.println("�ٽ� �Է����ּ���");
		}
		scanner.close();
	}
}
