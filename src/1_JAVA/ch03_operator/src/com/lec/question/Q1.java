package com.lec.question;

import java.util.Scanner;  //��ĳ�� ���� Ÿ������ ������ ������ �������� �ֵ��� �ϳ�

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //sc ��������� ������ �������̱⿡ �ϴܿ� Ŭ����� �ϸ� ��������� �����.
		//System.out.println(name.toUpperCase());  //toUpperCase �빮�ڷ� ��ȯ
		System.out.print("������ �Է��ϼ��� : ");
		int i = sc.nextInt();   // �������� ������ ���¿��� Ű���� �Է°��� �ö����� ��ٸ������̴� �׷��� �ϴܿ� ���� �ְ� ����ġ�� �۵� �Ϸ�
		System.out.println(i%3==0? "3�� ����Դϴ�":"3�� ����� �ƴմϴ�");
		sc.close();
	}
}
