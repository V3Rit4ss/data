package com.lec.ex;

public class Ex01_array {
	public static void main(String[] args) {
		int i = 10; // ������ ����� �ʱ�ȭ [�� ���� �ָӴϿ� �Ѱ���.]
		int[] iArr = { 10, 20, 30, 40, 50 }; // 1. �迭���� �� ����� �ʱ�ȭ int[] iArr = {a,b,c,d,e,....}
		iArr[1] = 200; // 2.  1���� ���� ������ �ٲ�. [ �迭�� index�� ����(index:0~4) ] iArr[0] �� ���� ������.
		for(int idx=0 ; idx<5 ; idx++) { //�Ϲ� for��  [Ȯ�� for�� �� ����]
			System.out.println(iArr[idx]);
//			System.out.println(iArr[0]);  �̷��� �ص� ������ ������ �����ɷ� �ٲܼ�����.
//			System.out.println(iArr[0]);
//			System.out.println(iArr[0]);
//			System.out.println(iArr[0]);
		}
		int[]iArr2 = new int[5];   //2. �迭���� ����� �迭�޸� ���� Ȯ��      new��� �����ϸ� ������ �������ش�. 0 , null �����ɷ�   //new ��ü(�����Ϳ�)�� �޸𸮾ȿ� ������ִ� ����.
		iArr2[0] = 999;  // �ش� ������ ��ȯ�� ���ָ� �� ������ �ٲ� ������ �ٲ��.
		for(int idx=0 ; idx<iArr2.length ; idx++) { //idx (<=) iArr2 �ش� ������ ������ ���� ���������� ��� ������ �Ǿ����� �˼�����. �ñ��ϸ� �غ���. 
			System.out.println(idx+"��° �� : "+ iArr2[idx]);
		}
		System.out.println("************������*************");
		int[] iArr3;// 3. �迭������ ���� ������. �ּҴ� 4����Ʈ.
		iArr3 = new int[5];  // ���� Ȯ��. 0 0 0 0 0
		//System.out.println(iArr3[0]); //���� Ȯ�� �ȵǸ� ��������.
		//for(int idx=0 ; idx<iArr3.length ; idx++) { //�Ϲ� for�� idx �峭�� ����.
		for(int temp : iArr3) { //Ȯ��for��   //�Ϲ� -> for(int idx=0 ; idx<iArr3.length ; idx++) //������ ���� �ٲܶ� �Ϲ�for��.
			temp = 10;			//Ȯ�� for��			// �Ϲ�-> iArr3[idx] = idx+1;	
		}
		for(int temp : iArr3) // Ȯ�� for�� �ӽú��� temp idx����� ����. �ܼ� ������ �̵��� ��°����� �Ҷ�. ������x 
			System.out.println(temp);
		}	
}