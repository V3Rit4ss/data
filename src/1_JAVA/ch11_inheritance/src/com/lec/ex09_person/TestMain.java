package com.lec.ex09_person;

public class TestMain {
	public static void main(String[] args) {
		Person papa = new Person("�ƺ���","�׶���");
		Person mom = new Person("������","������");
		papa.setName("�ƺ���");
		papa.setCharacter("�׶���");
	//	Person mama = new Person("������","�ƺ���");
	//	mama.setName("������");
	//	mama.setCharacter("������");
		papa.intro();
		mom.intro();
		System.out.println("====================================");
		Baby child1 = new Baby();
		child1.setName("�Ʊ��1");
		child1.setCharacter("�� �� �Ϳ���");
		child1.intro();
		Baby child2 = new Baby("���̰�2","�Ϳ���");
	}
}
