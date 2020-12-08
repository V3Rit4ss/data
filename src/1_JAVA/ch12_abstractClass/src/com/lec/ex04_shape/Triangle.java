package com.lec.ex04_shape;

public class Triangle extends Shape {
	private int w;
	private int h;
	public Triangle() {}
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	@Override
	public void computeArea() {
		System.out.println("�ﰢ���� ���̴� "+(w*h*0.5));

	}
	@Override
	public void draw() {
		System.out.println("�ﰢ��");
		super.draw();
	}
}
