package com.lec.ex06_this;

public class Friend {
	private String name;
	private String tal;
	public Friend () {
		System.out.println("�Ű����� 0�� ¥��");
	}
	public Friend (String name) {
		this();
		this.name = name; //this : �� ��ü��.
		//this() : �� Ŭ������ ������ �Լ�
		System.out.println("�Ű����� 1��¥��");
	}
	public Friend (String name, String tal) {
		this(name);      //this.name = name; �����ִ� ���� ȣ���.
		this.tal = tal;
	}
}
