package com.lec.ex;

//����
public class Q3 {
	public static void main(String[] args) {//���� ������ ������ ����
		int money = 2680 ;
		int[] coinUnit = {500 , 100 , 50 , 10} ;
		for(int coin:coinUnit) {
			System.out.print(coin + "�� ¥����" + (money / coin) + "��.  ");
			money %= coin; // money =money%coin;
		}
	}
}
//		}
//		System.out.print(coin + "�� ¥����" + (money / coin) + "��.  ");
//		money %= coin; // money =money%coin;
//	}for(
//	int i = 0;i<coinUnit.length;i++)
//	{
//	
//}
////}
