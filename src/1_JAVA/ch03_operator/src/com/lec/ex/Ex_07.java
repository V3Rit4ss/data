package com.lec.ex;
// ��Ʈ������ : &  ,  |      [&& || Ʈ�糪 ���� ���߿� �ϳ��� �´�.]  0 ���� 1 Ʈ��  00001 : 1  00000: 0 00010 : 2 00011 : 3 
public class Ex_07 {
	public static void main(String[] args) {
		int n1 = 10;       // 0 ~ 01010 : 10  
		int n2 = 5;       //  0 ~ 00101 
		int result = n1 & n2; // 0 ~ 00000
		System.out.printf("%d %c %d = %d\n", n1, '&', n2, result);
		result = n1 | n2;  // 0 ~ 00111  (15)
		System.out.printf("%d %c %d = %d\n", n1, '|', n2, result);
	}
}
