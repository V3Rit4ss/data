package com.lec.ex01_store;
// �δ��-5,000  �����-5,000   �����-����
public class StoreNum2 extends HeadQuarterStore {
	public StoreNum2(String name) {
		super(name);
	}//bude ġ�� ��+�����̽� ���� : @Override.
	@Override
	public void kimchi() {
		System.out.println("��ġ� 5,000��");
		
	}
	@Override  //�������̵� ������ : �θ� Ŭ������ �޼ҵ带 ������ ,�����ε� �ߺ����� : �Ű������� ���� Ÿ������ ���� �̸��� �Լ��� �ߺ�����
	public void bude() {
		System.out.println("�δ�� 5,000��.");
	}
	@Override
	public void bibib() {
		System.out.println("����� 5,000��.");
	}
	@Override
	public void sunde() {
		System.out.println("���뱹 5,000��");
		
	}
	@Override
	public void gonggibab() {
		System.out.println("����� ����.");
	}
}
