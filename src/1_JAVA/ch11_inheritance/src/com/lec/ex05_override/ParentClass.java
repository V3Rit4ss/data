package com.lec.ex05_override;

public class ParentClass {
	//�������Լ��� �����ε�[overloading] (�Լ��� �ߺ�����)
	public ParentClass() { 
		System.out.println("P �Ű����� ���� ������");
	}
	public ParentClass(int i) {
		System.out.println("P �Ű����� �ִ� ������");
	}
	public void method1() {
		System.out.println("Parent�� method1()");
	}
	public void method2() { //�����ε�
		System.out.println("Parent�� method2()");
	}//public void method2(int i) { //public int method2 �ȴ�.
	
		
	}

