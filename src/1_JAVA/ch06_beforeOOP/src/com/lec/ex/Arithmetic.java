package com.lec.ex;
// �޼ҵ� �� ��Ƴ������ִ�. ��Ű���� ����������
public class Arithmetic {
	public int sum(int to) { //����ƽ�� ����? ���赵��.
		int result = 0; //�����ؼ� ������ ����
		for(int i=1 ; i<=to ; i++) {
			result = result +i ; //result += i
		}
		return result ; 
	}
	public int sum(int from, int to) {  //ù ���� 1 ù �� 10 //�����̺��� ����������. �Ѱ������� ����
		int result = 0; //�����ؼ� ������ ����
		for(int i=from ; i<=to ; i++) {
			result = result +i ; //result += i
		}
		return result ; //�ؿ��ִ� �ش��ϴ� sum ���� ���� ������ �ٲ��.
		//System.out.println("1"); //���Ϲؿ��� ������ �߰��� ���Ѵ�.   //�Ѱ��� ���ϰ��� ���� .
	}
	public String evenOdd(int value) {
		String result = value%2==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		return result ;
	}
	public static int abs(int value) {
		int result = (value>=0 ) ? value : -value;
//		if(value <=0 ) {
//			reslut = value;
//		}else {
//			reslut = -value;
//		}
		return result;
	}
}
