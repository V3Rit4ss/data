package com.lec.ex5_momchild;//����ƽ�� ��߸� �ϴ� ��Ȳ.
//Child child = new Child("ù° �ʶ���");
//child1.takeMoney(100);
public class Child {
	private String name; //������ �ָӴϸ�
	static MomPouch momPouch = new MomPouch();  // ����ƽ�� �׻������ִ� ���� �� �����ϸ�� ���� �����ͷ� ����ȭ ���������
	public Child(String name) {
		this.name= name;
		
	}
	public void takeMoney(int money) {
		if(momPouch.money >= money) {
		//	momPouch.money = momPouch.money - money ; �̰ź��ٴ� �Ʒ��ִ°ɷ� ��
			momPouch.money -= money ;
			System.out.println(name+"��"+money+"�������� ����������"+momPouch.money);
		}else {
			System.out.println(name+"�� ���� ������. ���� ��������"+momPouch.money);
		}
	}
}
