package com.lec.ex6_product;
//product p1 = new Product();
public class Product {
	private int seriaNo; //��ü������ ��ȣ
	public static int count = 100 ; //�׳� ; �ϸ� 0���� ����. ī��Ʈ�� ����
	public Product() {
		seriaNo = ++count ; //�ø��� �ѹ��� �����ϸ鼭 ����
	}
	public void infoString() {
		System.out.println("serialNo="+seriaNo+"\t�������� count = "+count);
	}
	public void setSeriaNo(int seriaNo) {
		this.seriaNo = seriaNo;
	}
	public int getSeriaNo() {
		return seriaNo;
	}
}
