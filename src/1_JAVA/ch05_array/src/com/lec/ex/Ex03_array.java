package com.lec.ex;
// �迭�� ����
public class Ex03_array {
	public static void main(String[] args) { //String[] = 
		int[] score = {10,20,30,40,50};
		int[] s= new int[score.length]; //�Ϲ� for��
//		for(int i=0; i<score.length ; i++) {
//			s[i] = score[i];   //���� �ٸ������� ���� ���� �����ͳ���.
//		}
		System.arraycopy(score, 0, s, 0, score.length); //api �� �ϳ� �ñ��ϸ� Ŀ���� �����ٵ��� �ڽ�Ŭ���ϰ� ������ ����
		s[0] = 999;
		for(int i=0; i<s.length ; i++) {
			System.out.printf("s[%d]=%d, score[%d]=%d\n" , i, s[i], i, score[i]); //�迭�� ����
		}
	}
}
