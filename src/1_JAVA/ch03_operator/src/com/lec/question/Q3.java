package com.lec.question;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		                 //System.out.println( h%2==0 ? "¦��":"Ȧ��");
		System.out.println( a==b ? "O":"X");
		System.out.println( a>b ? "O":"X" );
		sc.close();
		
		
	}
}
