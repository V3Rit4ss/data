package com.lec.ex4_boxrect;

public class BoxRectMain {
	public static void main(String[] args) {
		BoxOrRect box = new BoxOrRect( 5 , 6 , 10 );
		BoxOrRect rect = new BoxOrRect( 10 , 5 );
		box.calNsetVolume();
		rect.calNsetVolume();
		System.out.println("�ڽ� ���� : "+box.getVolume());
		System.out.println("rect ���� : "+box.getVolume());
	}
}
