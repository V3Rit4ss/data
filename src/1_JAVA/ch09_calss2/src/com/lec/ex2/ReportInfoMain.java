package com.lec.ex2;

public class ReportInfoMain {
	public static void main(String[] args) {
		ReportInfo[] reportInfo = { new ReportInfo("���켺", 84, 96, 85) , new ReportInfo("���ϴ�", 52, 85, 51) , new ReportInfo("Ȳ����", 91, 98, 83) , new ReportInfo("������", 87, 70, 90) , new ReportInfo("������", 87, 80, 68)};
		String[] title = {"�̸�","����" , "����" , "����", "����", "���"};
		System.out.println("������������������������������������������������������");
		System.out.println("\t\t\t\t����ǥ");
		System.out.println("\t---------------------------------------------");
//		for(int i=0 ; i < title.length ; i++) {
//			System.out.println("\t "+title[i]);
//		}
		for(String t : title) {
			System.out.print("\t"+t);
		}
		System.out.println();
		System.out.println("\t---------------------------------------------");
		for(ReportInfo r : reportInfo) {
			r.print();
		}
		System.out.println("�����������������������������������������������������");
	}
}
