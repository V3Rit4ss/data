package com.lec.ex03_abstract;

public class TestMain {
	public static void main(String[] args) {
//		SuperClass sup = new SuperClass(); �Ұ�
		//ChildClass Child = new ChildClass(); �Ұ�
		SuperClass sup = new GrandChildClass();
		sup.method1();
		sup.method2();
//		sup.method3(); ������ Ÿ���� �޶� �Ұ�. ������ Ÿ���� �ٲٸ� �����ϱ���.
		ChildClass child = new GrandChildClass();
		child.method1();
		child.method2();
		child.method3();
		GrandChildClass grand = new GrandChildClass();
		grand.method1();
		grand.method2();
		grand.method3();
	}
}
