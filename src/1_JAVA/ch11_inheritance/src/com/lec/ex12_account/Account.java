package com.lec.ex12_account;

public class Account {
	private String accountNo;
	private String ownerName;
	private String cardNo;
	private int balance;
	public Account() {}
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	public Account(String cardNo ,String accountNo, String onwerName, int balance) {
		this.cardNo = cardNo;
		this.accountNo = accountNo;
		this.ownerName = onwerName;
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money ;
	}
	public void withdraw(int money) {
		if(balance >= money) {
			balance -= money ;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	public void info() {
		System.out.println("카드번호 : "+cardNo+"계좌번호:"+accountNo+","+ownerName+"님 잔액은" + balance);
		
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
