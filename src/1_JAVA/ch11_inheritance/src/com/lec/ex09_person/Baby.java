package com.lec.ex09_person;
//Baby b =new Baby("ȫ�浿","���ϴ�");
public class Baby extends Person {
	public Baby() {
		System.out.println("�Ű����� ���� Baby ������");
	}
	public Baby(String name, String character) {
		super(name, character);  // <--- �θ���� ������ �׻� ù ��ɾ�� ȣ��Ǿ����
//		setName(name);
//		setCharacter(character);
		System.out.println("�Ű����� �ִ� Baby ������");
	}
	public void cry() {
		System.out.println("��������");
	}
	@Override
	public void intro() {
		System.out.println(getName()+"��(��) �Ʊ�� ������ ��� �Ұ� �Ҳ�");
		super.intro();
	}
}
