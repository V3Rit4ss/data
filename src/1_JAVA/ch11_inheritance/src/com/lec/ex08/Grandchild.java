package com.lec.ex08;

public class Grandchild extends Child1{
	private int gc = 3;
	public Grandchild() {
		System.out.println("Grandchild�� ��ü ����");
	}
	public int getGc() {
		return gc;
	}
	public void setGc(int gc) {
		this.gc = gc;
	}
}
