package com.lec.ex;
// Car myPorsche = new car();
//myPorsche.color = "red";
// Scanner sc = Scanner(~);
public class Car {
	private String color; // Ŭ���� �ȿ��� (������[�����̺�] �� )  
	private int cc;
	private int speed;
	public Car( ) { //������ �Լ� = ����Ÿ���� ���� Ŭ������� ���� �̸��� �޼ҵ� //����Ʈ ������ �Լ��� ������ �Լ��� ������ JVM�� �ڵ� ���� // = new ~ �Ҷ� ���Ǵ°�
																											//��ü ������ ���� �ɶ� �ڵ� ȣ��
		cc = 1000;
	}
	public void drive( ) {  // Ŭ���� �ȿ���  (�޼ҵ�[�ۺ�] �� )
		speed = 60;
		System.out.println("�����Ѵ� ���� �ӵ� : "+speed);
	}
	void park() {//�ۺ� �Ƚᵵ ����� �ٵ� ���� �ۺ� �ְ���
		speed = 0;
		System.out.println("�����Ѵ� ���� �ӵ� :"+speed);
	}
	void race() {
		speed = 120;
		System.out.println("���̽��Ѵ�. ���� �ӵ� :"+speed);
	}
	// ~.setColor("red")
	public void setColor(String color) {
		this.color = color; 
	}
	//~.getColor()
	public String getColor() {
		return color;
	}
	//~,getCc()
	public int getCc() {
		return cc;
	}
}
