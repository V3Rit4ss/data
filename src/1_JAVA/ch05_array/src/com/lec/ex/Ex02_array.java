package com.lec.ex;

public class Ex02_array {
	public static void main(String[] args) {
		//double[] hak = {4.5,3.3,3.0};   ���� �ָӴϴ� �پ��ϰ� ����Ҽ��ִ�.
		//String[] names = {"ȫ�浿 , ��浿"};
		int i = 10;
		int j = i;
		j = 100;
		System.out.printf("i=%d, j=%d\n", i , j);
		int[] score = {10,20,30,40,50};//���Ʒ�. �̷��� �ϸ�
		int[] s = score;   // �������� �����Ѵ�.
		s[0] = 100;
		for(int idx=0 ; idx<score.length ; idx++) {  //
			System.out.printf("score[%d] = %d, s[%d]=%d\n", idx, score[idx] , idx , s[idx]);  //�迭 ī��.
		}
	}
}
