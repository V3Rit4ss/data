package com.lec.ex13_final;
/*
 * 20 / 12 - 08 Won Dong Seon
 */
public class Animal {
	protected int speed;
	public void running() {
		//final int TEMP = 10;
		//TEMP += 5;
		speed += 5;
		System.out.println("�ٰ� �־��. ����ӵ� : "+speed);
	}
	public final void stop() { //��ӺҰ� �������̵� ������~
		speed = 0;
		System.out.println("����");
	}
}
