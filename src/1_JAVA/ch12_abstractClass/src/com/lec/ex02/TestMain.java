package com.lec.ex02;

public class TestMain {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.method1();
//		Super c2 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		Super c2 = new Child();
		c2.method1();
		c2.method2();
		//Super s;  //���� ���� ����.
//		Super s =new Super() {   new Super ���� �� + �����̽��� �ϰ� �ϸ� �ȵ���̵忡���� ���̴� ����� ����.
//			
//			@Override
//			public void method1() {
//				System.out.println("�ȵ���̵忡���� �̷��� ��.");	
//			}
//		};
//		s.method1();
	}
}
