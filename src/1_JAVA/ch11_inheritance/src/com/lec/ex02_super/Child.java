package com.lec.ex02_super;

public class Child extends SuperIJ{
	private int total;
	public Child(int i, int j) { //this.i ��°� �ٸ� ���Ͽ� �ֱ⿡ �ȴ�.
		setI(i);
		setJ(j);
	}
	public void sum() {
		total = getI()+getJ();//total �� i+j �Ҵ� �Ұ���
		System.out.println("�� ��ü�� total:"+total);
	}
}
