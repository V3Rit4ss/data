package com.lec.ex01_store;//StoreNum1 store1 = new StoreNum1("���ð� 1ȣ��")
//��ġ�-5,000  �δ��-5,000  �����-6,000 ���뱹-���Ⱦ� �����-1,000��
public class StoreNum1 extends HeadQuarterStore {
	public StoreNum1(String name) {
		super(name);
	}
	
	@Override
	public void kimchi() {
		System.out.println("��ġ� 4,500dnjs");
	}
	
	@Override
	public void bude() {
		System.out.println("�δ�� 5,000��.");
	}
		@Override
		public void bibib() {
			System.out.println("����� 6,000��");
		}
	
	@Override
	public void sunde() {
		System.out.println("���뱹 �� �Ⱦ�");
	}

	@Override
	public void gonggibab() {
		System.out.println("����� 1,000��");
	
	}
}
