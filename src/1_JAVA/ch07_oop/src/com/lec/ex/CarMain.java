package com.lec.ex;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car myPorsche = new Car();
		
		Car yourPorsche = new Car();
		myPorsche.drive();
		yourPorsche.drive();
		myPorsche.park();
		myPorsche.race();
		myPorsche.setColor("red");//myPorsche.color = "red";
		System.out.println("�� ������ ���� :"+myPorsche.getColor());
		System.out.println("�� ������ ���� :"+yourPorsche.getColor());
		System.out.println("�� ������ ��ⷮ :"+myPorsche.getCc());
		sc.close();
	}
}
