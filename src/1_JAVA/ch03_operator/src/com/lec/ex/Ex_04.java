package com.lec.ex;
//��������(&& : and , || : or)
// true && true = true
// true && false = false
// false && true = false
// false && false = false
public class Ex_04 {
	public static void main(String[] args ) {
		int i=1, j=10 , h=10;
		//"�ȳ��ϼ���"+1 : ��Ʈ���� ���ڴ� �������� �ʱ⿡ ��Ʈ�� �� ��Ʈ�� ���� ����.
		System.out.println("i<j && ++j>h ��"+ ((i<j) && (++j>h)  )); 
		System.out.println("j="+j);
		
		System.out.println("i>j && ++j>h ��"+ ((i>j) && (++j>h)  )); //���� false �� �ڴ� �������. 
		System.out.println("j="+j);
		
		
		
		System.out.println("i<j || ++j>h ��"+ ((i<j) || (++j>h)  )); // Ʈ�� ���̸� �ڸ� �Ⱥ�
		System.out.println("j="+j);
		
		System.out.println("i>j || ++j>h ��"+ ((i>j) || (++j>h)  ));
		System.out.println("j="+j);
	}
}
