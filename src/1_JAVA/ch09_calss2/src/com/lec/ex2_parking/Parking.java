package com.lec.ex2_parking;

import com.lec.cons.PiClass;

public class Parking {
	private String numBer ;
	private int inTime ;
	private int outTime ;
	private int fee ;
	//private final int HOURYRATE = 2000; //(���) final : �ѹ� �����ϸ� �ٲ�������.
	public Parking() {}
	public Parking(String numBer , int inTime) {
		this.numBer = numBer ;
		this.inTime = inTime ;
		System.out.println(numBer+"�� �������");
		System.out.println("�����ð� : "+inTime+"��");
		System.out.println("=========================");
	}
	public void out(int outTime) {
		this.outTime = outTime;
		fee = (outTime - inTime) * PiClass.HOURYRATE;
		System.out.println(numBer+"�� �ȳ��� ������");
		System.out.println("�����ð� : "+inTime+"��");
		System.out.println("�����ð� : "+outTime+"��");
		System.out.println("������� : "+fee+"��");
		System.out.println("=========================");
	}
	public String getNumber() {
		return numBer;
	}
	public void setNumber(String numBer) {
		this.numBer = numBer;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getOutTime() {
		return outTime ;
	}
	public void setOutTime(int outTime) {
		this.outTime = outTime ;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
}
