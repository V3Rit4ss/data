package com.lec.ex7_student;

public class StudentTestMain {
	public static void main(String[] args) {
		Student[] student = { new Student("���켺", 84, 96, 85) , new Student("���ϴ�", 52, 85, 51) , new Student("Ȳ����", 91, 98, 83) , new Student("������", 87, 70, 90) , new Student("������", 87, 80, 68)};
		String[] title = {"��ȣ","�̸�","����" , "����" , "����", "����", "���"};
		System.out.println("����������������������������������������������������������������������");
		System.out.println("\t\t\t\t����ǥ");
		System.out.println("\t-------------------------------------------------------");
//		for(int i=0 ; i < title.length ; i++) {
//			System.out.println("\t "+title[i]);
//		}
		for(String t : title) {
			System.out.print("\t"+t);
		}
		System.out.println();
		System.out.println("\t--------------------------------------------------------");
		for(Student s : student) {
			s.print();
		}
		System.out.println("���������������������������������������������������������������������");
	}
}

