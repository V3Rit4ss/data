package com.lec.ex;
//�ߺ� �����Լ� �޼ҵ�� ��.
public class Ex02_beforOOP2 {
	//sum() method ���� �Ʒ��� �������
	private static int sum(int to) { 
		int result = 0; //�����ؼ� ������ ����
		for(int i=1 ; i<=to ; i++) {
			result = result +i ; //result += i
		}
		return result ; 
	}
	private static int sum(int from, int to) {  //ù ���� 1 ù �� 10 //�����̺��� ����������. �Ѱ������� ����
		int result = 0; //�����ؼ� ������ ����
		for(int i=from ; i<=to ; i++) {
			result = result +i ; //result += i
		}
		return result ; //�ؿ��ִ� �ش��ϴ� sum ���� ���� ������ �ٲ��.
		//System.out.println("1"); //���Ϲؿ��� ������ �߰��� ���Ѵ�.
	}
	private static String evenOdd(int value) {
		String result = value%2==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		return result ;
	}
	public static void main(String[] args) { //�����̸��� �Լ��̸� ���Ƶ� ��
		int sum =sum (10);     //<--- �����̸��� �Լ��̸� ���Ƶ� �� �ڹٿ����� �Լ��� ������ �ٸ���ü.
		System.out.println("���� "+sum);
		System.out.println(evenOdd(sum)); 
		sum = sum(1,100);
		System.out.println("���� "+sum);
		System.out.println(evenOdd(sum)); 
		sum = sum(10,51);
		System.out.println("���� "+sum);
		System.out.println(evenOdd(sum)); 		
	}//�����Լ�
	//sum() method
}//
