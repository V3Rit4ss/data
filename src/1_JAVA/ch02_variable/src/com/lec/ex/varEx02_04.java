package com.lec.ex;

public class varEx02_04 {
	public static void main(String[] args) {
		// ���� ���� ���
		//1. �ڷ��� ������;
		int num1; // ���� �ϰ� ���� �Ҵ��� ����.
		num1 = 10;
		System.out.println("num1="+num1);
		// 2. �ڷ��� ������ = ��;
		char c1 = '��'; //'��' �� ���� �ѱ���  "�ȳ�" �� ���� �ΰ�
		System.out.println("c1="+c1);
		// 3. �ڷ��� ������1, ������2, ... ������n;
		boolean b1, b2, b3;  //0 �̳� 1�̳� ������ �ۿ� Ʈ�� or �R����
		b1 = true; b2=false; b3 = true; //�ڹٿ����� �и�����. b3 = 1; �̰� �ȴ�
		System.out.print("b1="+b1+"\t b2="+b2+"\t b3="+b3+"\n");
		// 4. �ڷ��� ������1=��1, ������2=��,... ������n=��n;
		long l1 = 22000000000L; // L �� 22���ڸ����� �� ���� ����.
		float f1 = 1.19f, f2=2.22f, f3; //f �÷�Ʈ �� ª�� �Ҽ��� , double ���� �� �Ҽ��� ���� ǥ��.
		System.out.println("f1="+f1+"\t f2="+f2);
		System.out.printf("f1 = %3.1f, f2 = %4.1f\n",f1, f2); //%f �� �Ҽ��� �ڸ� ���� �Ҽ�����.(%n.n) [���� ����] %3�ڸ� �Ҽ��� 1�ڸ��� , %4�ڸ� �Ҽ��� 1 �ڸ���
		// %f : �Ǽ� , %d : ����(�Ҽ��� ���°͵� : int,short,byte,long) , %c : ���� , %x : 16����
		
		
		System.out.println("���α׷� ��");		
	}//���α׷� ��
}//class ��
