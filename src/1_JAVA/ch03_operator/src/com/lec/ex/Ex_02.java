package com.lec.ex;

public class Ex_02 {
	public static void main(String[] args) {
		int n1 =10;
		int n2 = n1++; // n1 : 11 , n2 : 10
		System.out.printf("1. n1=%d, n2=%d\n", n1, n2);
		// 1���� : 10 
		//++n1;  // �ϳ� ���� �ض� (++)
		// 2���� : 11   �ٷ� �տ��� �ٲ�
		//n1++;
		// 3���� : 12   ���� ������ �ٲ� [�Ѹ���� ++n�� �ٷ� �����ϰ� ���� ������, n++�� ��� '��' ��  n���� ���� ������ �׸��ڴ� �����Ѱ��� ��������.
		int n3 = 10;
		System.out.printf("2. n3 = %d\n", n3--);
		System.out.printf("3. n3 = %d\n", n3);
		int temp = 10;
		System.out.printf("4. %d %d %d %d\n", 
						temp++, ++temp, temp--, temp--);
		//				10		12		12		11
		System.out.printf("5. ���� temp = %d\n", temp);
	}
}
