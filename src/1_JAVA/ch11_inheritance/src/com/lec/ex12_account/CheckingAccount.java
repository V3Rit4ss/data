package com.lec.ex12_account;

public class CheckingAccount extends Account {
	private String cardNo;
	public CheckingAccount(String accountNo, String ownerName, String cardNo) {
		super(accountNo,ownerName);
		this.cardNo = cardNo;
	}
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	//CheckingAccount kim = new CheckAccount("12","ȫ","1111~");
	//kim.pay("1111~",10)
	public void pay(String cardNo, int amount) {
		if(this.cardNo.equals(cardNo)){
			if(getBalance()<amount) {
				System.out.println("=== �ܾ��� �����մϴ�. ===");
			}else{
				setBalance(getBalance()-amount);
				System.out.println("=== "+amount+"���Ǽ�"+getBalance()+"�ܾ� ===");
			}
		}else {
			System.out.println("ī���ȣ�� Ʋ����.");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
