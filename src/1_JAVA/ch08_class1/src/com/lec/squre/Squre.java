package com.lec.squre;
//Squre s1 = new Squre()
//Squre s2 = new Squre(10);
//Scanner sc = new Scanner(System.in)
public class Squre {
	private int side;
	public Squre() {//����Ʈ ������ �ƹ��͵� ���ϴ�[�Ű��������� ������] �׳� �����δ°� ���� =>������ �����ε�
		System.out.println("�Ű����� ���� ������ ȣ���");
	} 
	public Squre(int side) { //�Ű� ���� �ִ� ������
		this.side = side;
		System.out.println("�Ű����� �ִ� ������ ȣ���");
	}
	public int area( ) {
		return side * side;
	}
	//~.getSide()
	public int getSide( ) {
		return side;
	}
	//~.setSide(10)
	public void setSide(int side) {
		this.side = side;
	}
}
