package com.lec.man;

public class Manman {
	public static void main(String[] args) {
//		Man[] student = new Man(20, 170, 60, "010-9999-9999");
//		new Man(20, 170, 60);
//		new Man(20, "010-9999-9999");
//Man[] student = {kim,yi,kang} ;
//int[] iArr = {10,20,30} ;
		Man kim = new Man(20, 170, 60, "010-9999-9999");
		Man yi = new Man(20, 170, 60);
		Man kang = new Man(20, "010-9999-9999");
		Man[] student = {kim,yi,kang} ;
		yi.setTel("010-8888-8888");
		kang.setHeight(100); kang.setWeight(65);
		double biman = kim.calculateBMI();
		if(biman>24) {
			System.out.println("kim �� ���̴� �ǰ�����");
		}else {
			System.out.println("kim�� ���̾�Ʈ ����");
		}
		biman = yi.calculateBMI();
		System.out.println(biman>24? "�ǰ����� ���̾�Ʈ" : "���̾�Ʈ ����");
		biman = kang.calculateBMI();
		System.out.println(biman>24? "�ǰ����� ���̾�Ʈ" : "���̾�Ʈ ����");
	}
}
