package com.lec.ex04_shape;

public class TestMain {

	public static void main(String[] args) {
//		Shape shape1 = new Circle(5);
//		Shape shape2 = new Rectangle(10,5);
//		Shape shape3 = new Triangle (5,10);
		Shape[] shape = { new Circle(5), new Rectangle(10,5), new Triangle(5,10)};
//		for(int i=0 ; i<=shape.length ; i ++) {
//			shape[i].draw();
//			shape[i].computeArea();  //���� �ܰ� ���� : ���� �߻�.  ����ܰ� ���� �� = ���� ���ٵ� ���� ������ �����ε��� �ұ��ϰ� ����������� �����ߴ°�.
//		}
		for(Shape s : shape) { //Ȯ�� for��
			s.draw();
			s.computeArea();
		}

	}

}
