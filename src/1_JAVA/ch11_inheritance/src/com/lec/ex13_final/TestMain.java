package com.lec.ex13_final;

public class TestMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.running();
		animal.running();
		animal.stop();
		Dog dog = new Dog();
//		Animal dog2 = new Dog();
//		Object dog3 = new Dog();
		dog.running(); dog.stop();
		dog.method(); // ����
		Animal dog2 = new Dog();
		dog2.running(); dog2.stop();
//		dog2.method(); �ֱ��ϳ� �Ұ���.
		Rabbit rabbit = new Rabbit();
		rabbit.running();
		rabbit.stop();
	}
}
