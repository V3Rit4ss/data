package com.lec.ex;
//2���� �迭
public class Ex04_array {
	public static void main(String[] args) {
	//	int[] test = {10,20};  //���ڷ� �����°� ������ �迭
		int[][] test = {{10,20,30} , {40,50,60}}; //������ �迭 <�ΰ��� ��ȿ� ���� �迭�� �ִ� ����.>
		test[0][2] = 300 ; //�迭 �� �ٲ۰�.
		System.out.println(test[0][2]);    //������  
		for(int i=0 ; i<test.length; i++) { //i<test.length -> i<2 �� �ٲ�ᵵ ��.
			for(int j=0 ; j<3 ; j++) { //test[i].length <- �̷��� �Ҽ�����.
				System.out.printf("test[%d][%d] = %d\n", i, j, test[i][j]);
			}
		}
	}
}
