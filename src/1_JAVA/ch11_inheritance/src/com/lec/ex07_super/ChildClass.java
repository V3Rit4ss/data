package com.lec.ex07_super;

public class ChildClass extends ParentClass {
	private String cStr = "�ڽ� Ŭ����";

	public ChildClass() {
		System.out.println("�ڽ� ������");
	}

	@Override
	public void getMamiName() {
		//this. ; �� ��ü��
		//this() ; �� Ŭ������ ������ �Լ�
		//super. ; �θ���  , �ణ�� �ٲܶ�. (�ƹ����� �ᵵ ��.)
		//super() ; �θ� Ŭ������ ������ (�� ���ٿ����� ����).��ġ���� ������ ����.
		System.out.print("�̻� ���� �̻� ");
		super.getMamiName(); 
	}

	public String getcStr() {
		return cStr;
	}

	public void setcStr(String cStr) {
		this.cStr = cStr;
	}
}
