package com.lec.ex3_accessTest;

public class AccessTestMain {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
//		System.out.println(obj.privateMember);
		System.out.println(obj.defaulrMember); //���� ��Ű��
		System.out.println(obj.protectedMember);//���� ��Ű���ų� ��� ���� Ŭ������
		System.out.println(obj.publicMember);//���� ��Ű��
		//obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();
	}
}
