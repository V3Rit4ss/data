package com.lec.ex;
public class varEx05_06 {
	public static void main(String [] args) {  //String = ���ڿ�. �⺻����ŸŸ��(�⺻�ڷ���)�� �ҹ��� , �ƴϸ� �빮��. �� : ���������� Ÿ��(�����ڷ���,��ü�ڷ���)
		float f; double d;
		f = 3.14159265359f; // 0.010*10�� 2�� : 0.101E2
		d = 3.14159265359; //�Ǽ� �����ʹ� double �� �ϴ°� ����.
		System.out.println(f); // �Ҽ��� ���ڸ�����
		System.out.println(d); // �Ҽ��� ���ڸ�����
		f = 10.001f;
		d = 10.001;
		System.out.println("f="+f);
		System.out.println("d="+d);
		if(f==d)  // == : �ΰ��� �ָӴϰ� ���� ���̳�  // if ������ �����϶�
			System.out.println("���� ����");
		else  // if�� ���� �ƴҶ�
			System.out.println("���� �ٸ���");
	}
}





