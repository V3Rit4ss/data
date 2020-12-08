package com.lec.ex0_janmuri;

class PersonInfo {
	private String name; // �̸�
	private int age; // ����
	private char gender; // ���� "��" , "��" //�ۺ� Ŭ������ ���� �ϳ���.

	public PersonInfo() {
	} // �����ڰ� ������츸 ����Ʈ �����ڴ� JVM �� ������

	public PersonInfo(String name, int age, char gender) { // ������ �����ε�
		this.name = name;
		this.age = age;
		this.gender = gender;
	}// ������ �����ε�

	public void print() {
		System.out.println("�̸�=" + name + "\t����=" + age + "\t����=" + gender);
	}

	public String inforSting() {
		String result = "�̸�=" + name + "\t����=" + age + "\t����=" + gender;
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}// class
//public class PersonInfoTestMain {
//	public static void main(String[] args) {
//		PersonInfo p = new PersonInfo("ȫ�浿",22,'��');
//		p.print();
//		System.out.println(p.inforSting());
//	}
//}//main   //�̷� ����Ʈ�� ��������. �ܸӸ���. �Ѱ��� Ŭ���� ���� �Ѵ��ִ°�

public class PersonInfoTestMain {
	public static void main(String[] args) {
		int[] iArr = {10,20,30}; //int [] '����' �����̸��� �������.
		PersonInfo[] person = {new PersonInfo("ȫ�浿",20, '��') , new PersonInfo("ȫ���",22, '��'), new PersonInfo()};//�迭
		person[2].setName("ȫ���");
		person[2].setAge(21);
		person[2].setGender('��');
		for(PersonInfo p : person) {
			p.print();
			System.out.println(p.inforSting());
		}
//		for(int i=0; i<person.length ; i++) {   �Ϲ� for
//			System.out.println(person[i].inforSting());
//			person[i].print();
//		}
				
	} //main//�迭�� �ٲ۰���.
}//class