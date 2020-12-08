package com.lec.ex;

//동전
public class Q3 {
	public static void main(String[] args) {//정수 나누기 정수는 정수
		int money = 2680 ;
		int[] coinUnit = {500 , 100 , 50 , 10} ;
		for(int coin:coinUnit) {
			System.out.print(coin + "원 짜리는" + (money / coin) + "개.  ");
			money %= coin; // money =money%coin;
		}
	}
}
//		}
//		System.out.print(coin + "원 짜리는" + (money / coin) + "개.  ");
//		money %= coin; // money =money%coin;
//	}for(
//	int i = 0;i<coinUnit.length;i++)
//	{
//	
//}
////}
