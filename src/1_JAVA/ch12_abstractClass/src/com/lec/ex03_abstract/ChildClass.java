package com.lec.ex03_abstract;

public abstract class ChildClass extends SuperClass { //�������̵带 �ϴ��� �߻�Ŭ������ �ִ���.
	//SuperClass �� ���� ���� �߻� �޼ҵ� method1() �� �ֱ⿡  �������̵� ������. 
	@Override
	public void method2() { //�Ϲ� �޼ҵ嵵 ���������.
		System.out.println("ChildClass �� method2()");
	}
	public void method3() {
		System.out.println("ChildClass �� method3()");
	}
}

//SuperClass �κп� �ִ���.
//	public abstract void method1(); //�߻� �޼ҵ�
//	public void method2() {
//		System.out.println("SuPer�� method2()");
//	}