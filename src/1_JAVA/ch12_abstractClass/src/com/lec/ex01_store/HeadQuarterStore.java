package com.lec.ex01_store;
// ���� ��ħ : �ݵ�� �������̵� �Ͻÿ� (������) [abstract] : �߻�޼ҵ� 1�� �̻� �ִ� Ŭ����  . 
//h.kimchi �̷��� ���� �߻�Ŭ������ �ִ°Ŷ�.
//HeadQuarterStore[] store = new HeadQuarterStore(); �Ұ�
public abstract class HeadQuarterStore {
	private String name;
	public HeadQuarterStore(String name) {
		this.name=name;
	}
	public abstract void kimchi(); //�߻�(abstract) �޼ҵ� 
	public abstract void bude();
	public abstract void bibib();
	public abstract void sunde();
	public abstract void gonggibab();
	public String getName() {
		return name;
	}
}
