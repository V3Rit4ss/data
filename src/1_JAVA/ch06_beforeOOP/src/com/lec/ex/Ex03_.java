package com.lec.ex;

import java.util.Scanner;

public class Ex03_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = -5 ;
		System.out.println(su+"�� ���밪��"+Arithmetic.abs(su));
		
		Arithmetic ar = new Arithmetic(); // Arithmetic �� ��ü ������ ��.
		int sum = ar.sum(10,51) ;
		System.out.println("����"+sum);
		System.out.println(ar.evenOdd(sum));
		System.out.println("**********************");
		sum = ar.sum(50);
		System.out.println("����"+sum);
		System.out.println(ar.evenOdd(sum));
		sc.close();
	}
}
