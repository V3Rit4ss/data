package com.lec.ex13_final;
//final Ŭ���� : ��ӺҰ�.
public final class Dog extends Animal {
	@Override
	public void running() {
		speed += 10;
		System.out.println("�������� �ٸ鼭 ������ �����. ���� �ӵ� : "+speed);
	}
	
}
