package com.lec.loop;
// 1���� 20���� �������� ���
// 1+2+3+4+5+6+7+8+9+10+11+12+... +19+20 = 210
public class Ex02_for {
	public static void main(String[] args) {
		int tot = 0; // ������ ����
		for (int i = 1; i < 21; i++) {// i <=20 �̳� �����ɷ�
			// tot ������ i���� ��� ���� //i ���� ��� �����ϰ� "i+ "��"1= " �� ���
			tot = tot + i;
			if (i != 20) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			} // if
		} // for
		System.out.println("1~20���� �������� " + tot);
	}// main
}// class
