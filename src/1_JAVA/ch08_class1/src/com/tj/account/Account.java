package com.tj.account;
/* ������� Ŭ���� 
 * (������ : ���¹�ȣ accountNo:String[111-222-222222] , ������ ownerName:String, �ܾ� balance:int )
 * �޼ҵ� : �����Ѵ� (void deposit(int money)) , �����ϴ� (int or void withdraw(int moeny)) 
 * new Account("111-111-222222", "ȫ" , 10)
 */
public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	public Account() {}
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	public Account(String accountNo, String onwerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName=onwerName;
		this.balance =balance;
	}
	public void deposit(int money) { //������ ������
		balance += money ;
	}
	public void withdraw(int money) { //�ܾ� ������ -1 return // void �� �ؼ� ���ڷ� ǥ�����ֱ�
		if(balance >= money) {
			balance -= money; //balance = balance -money;
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}		
	}
	public void info() {
		System.out.println("���¹�ȣ:"+accountNo+","+ownerName+"�� �ܾ���" + balance);
	}
	//accountNo, onwerName , balance setter&getter
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo ;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setOnwerName(String onwerName) {
		this.ownerName = onwerName ;
	}
	public String getOnwerName() {
		return ownerName;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
}
