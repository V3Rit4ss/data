package com.lec.loop;

public class Ex05_forbreak {
	public static void main(String[] args) {
		for(int i=1 ; i<11 ; i++ ) {
			if(i==5) {
				//break; // �ݺ��� ���� ������������ �� ������ ��������.
				continue; // ���������� �ö�  �Ʒ� ���ǽľȰ��� ���� �ٷ� �ö�.if ���ǽĿ� �´¾ִ� �ǳʶپ����  
			}
			System.out.print(i+ " ");
		}
	}
}
