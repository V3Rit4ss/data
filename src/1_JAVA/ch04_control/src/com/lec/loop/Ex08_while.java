package com.lec.loop;
//i �� 1�϶� �������� x �̴� (i�� 1~10����)
public class Ex08_while {
	public static void main(String[] args) {
		int i=1;     //ȭ�� �������� �ʱ�ȭ������
		int sum =0;
		while(i<=10) {
			sum += i; //sum = sum + i;
//			System.out.println("i�� "+i+"�� �� �������� "+sum+"�̴�"); �̷��� �ص� ������ �����ϰ� �������� ������ �ֱ⿡ �Ʒ� ó�� �ϴ°� �������� �� ����.
			System.out.printf("i�� %d�� �� �������� %d�̴� \n",i ,sum);
			++i;
		}
//		for(int j=1 ; j<=10 ; j++) {
//			System.out.printf("i�� %d�� �� �������� %d�̴� \n",i ,sum);
//		}
	}
}