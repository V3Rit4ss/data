package com.lec.ex;
// ����ȯ = �������� ����ȯ, ������� ����ȯ
public class varEx07 {
	public static void main(String[] args) {
		int i1 = 10; //4byte ���� ����
		long l1 = 22000000000L; 
		l1 = 10;   //long �� 8byte ���� 4byte ¥�� 10�� �Ҵ��ϱ� ���� 4byte ¥�� 10�� 8byte������ �������� ����ȯ�� ��.
		double d = i1; //�������� ����ȯ ū �濡 ���� ���ڰ� �� ��. (������ ���� �ڸ��� 0���� ǥ�ô�)
		d = 10.7;
		i1 = (int)d;  //������� ����ȯ(����� �ٲ�!) �ÿ��� ������ �ս��� �ü� �ִ� (�� ���ڸ��� ©����)
		System.out.print("i1="+i1);
	}
}
