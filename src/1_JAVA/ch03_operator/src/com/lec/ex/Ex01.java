package com.lec.ex;
//��� ������ ( + , - , * , / , [%������������])
public class Ex01 { // class ����
	public static void main(String[] args) { //main �Լ� ����
		int n1 = 33, n2=10;
		int result;
		double resultDouble; //����Ʈ ���ϱ� ���� ������
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n" , n1, '+' , n2, result);
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n" , n1, '-' , n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n" , n1, '*' , n2, result);
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n" , n1, '/' , n2, result);
		resultDouble = (double)n1 / n2;
		System.out.printf("%d %c %d = %.1f\n" , n1, '/' , n2, resultDouble); //%.1f\n �Ҽ��� ���ڸ� ǥ�� , %.3f\n �Ҽ��� ���ڸ� ǥ��.
		result = n1 % 2;
		System.out.printf("%d %c %d = %d\n" , n1, '%' , n2, result);
		// ������ �������� ���ӻ�
		if (n1%2==0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
	} //main �Լ� ��
}//class ��d
