package com.lec.loop;

public class homework_1 {
	public static void main(String[] args) { // �ִ��� �ϰ� �ȵŸ� �ָ����� ����.
		int i = 1;
		int su = 0;
		while (i <= 20) {
			if (i %2 != 0 && i%3!= 0) {
				su += i;
			}//if      // 1�� �������� �� ���µڿ� while ��Ͼȿ��� i=1 �� ������Ű�� ���� �ִ´� [i++] =>�� ������ �ʰ� �����ȴ�. 
			i++;    // 1.���� ���� ������ 1���� ���ϰ��� true -> ������ -> true -> [���� ���� 1���� ��� ���⶧��] 
		}//while
		System.out.printf("2��3�� ����� �ƴ� ���� �� :"+su);
	}//main
}//class