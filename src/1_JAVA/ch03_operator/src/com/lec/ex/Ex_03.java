package com.lec.ex;
// ����(��)������ : ����(==) , �ٸ��� (!=) , ũ��(>) , �۴� (<) ,ũ�ų� ���� (>=)
public class Ex_03 {
	public static void main(String[] args) {
		int n1=10, n2=5;
		boolean result = n1 > n2;  // n1 n2 ������ ����Ʈ ���� ��  [ () �켱���� = ù��° ]
		System.out.printf("%d %s %d = %b\n" , n1, ">", n2, result); // %s : > ��ȣ
		result = (n1 >= n2); // () 1����
		System.out.printf("%d %s %d = %b\n" , n1, ">=", n2, result);
		result = n1 == n2;
		System.out.printf("%d %s %d = %b\n" , n1, "==", n2, result);
		result = n1 != n2;
		System.out.printf("%d %s %d = %b\n" , n1, "!=", n2, result);
	}
}
