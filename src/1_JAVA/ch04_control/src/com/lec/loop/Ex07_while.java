package com.lec.loop;
// 10. 9. 8. 7. 6. ... 1.
public class Ex07_while {
	public static void main(String[] args) {
		int i=10;
		while(i>=1 ) {
			System.out.print(i+". "); //(i--+". ") �̷��� �־ �Ǳ�� �ϳ� �������� ���� �����⿡ �Ʒ� ���� ó�� ����.
			i--; // ����ڷ�.
		}
		
		for(int j=10 ; j>=1 ; j--) {
			System.out.print(j+". ");
		}
	}
}
