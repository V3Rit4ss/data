package com.lec.ex;
//���ϵ� �޼ҵ嵵 ���� ����ƽ
public class Ex04_nonreturn {
	public static void main(String[] args) {
		printCh();
		System.out.println("Hello, World!");
		printCh('=');
		System.out.println("Hello, Java!");
		printCh('-' , 30);
	}
	private static void printCh(char ch , int count) {
		for(int cnt=1 ; cnt<=count ; cnt++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	private static void printCh(char ch) {
		for(int cnt=1; cnt<=20; cnt++) {
			System.out.print(ch); //ch�� 20�� �ִ� ����
		}
		System.out.println();//����
	}
	private static void printCh() {
		for(int cnt =1 ; cnt<=20; cnt++) {
			System.out.print('*'); // *�� 20�� �ִ� ����
		}
		System.out.println();
	}
}
