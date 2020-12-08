package com.lec.ex12_account;

public class CreditLineAccount extends CheckingAccount {
	private long creditLine;

	public CreditLineAccount(String accountNo, String ownerName, String cardNo, int creditLine) {
		super(accountNo, ownerName, cardNo);
		this.creditLine = creditLine;
	}

	public CreditLineAccount(String accountNo, String ownerName, int balance, String cardNo, int creditLine) {
		super(accountNo, ownerName, balance, cardNo);
		this.creditLine = creditLine;
	}

	@Override
	public void pay(String cardNo, int amount) {
		if (getCardNo().equals(cardNo)) {
			if (creditLine < amount) {
				System.out.println(getOwnerName() + "��, �ѵ� �ʰ��Դϴ�.");
			} else {
				creditLine -= amount;
				System.out.println(getOwnerName() + "��, " + amount + "�� ���(�ܿ� �ѵ��� : " + creditLine + "��)");
			}
		} else {
			System.out.println("ī�� ��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}

	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("ī�� �ѵ��� : "+creditLine);
	}
	public long getCreditLine() {
		return creditLine;
	}
}
