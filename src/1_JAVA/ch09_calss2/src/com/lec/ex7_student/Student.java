package com.lec.ex7_student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private int no;
	public static int count = 0 ; //0�̸� 0�ʰ����� ��, 0 �̸� 1�� ����.
	public Student() {
		no = ++count ; //�ø��� �ѹ��� �����ϸ鼭 ���� 
	}
//	public void infoString() {
//		System.out.println(studentNo+);
//	}
	
	public Student(String name, int kor, int eng, int mat ) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor+eng+mat;
		avg = tot/3.0 ;
		no = ++count ; //
	}


	public void print() {
		System.out.printf("\t%d \t %s \t %d \t%d \t%d \t%d \t%.1f\n" , no, name, kor, eng, mat, tot, avg );
	}//"���� : "+name+"\n���� : "+kor+"\n���� : "+eng+"\n���� : "+mat+"\n���� : "+tot+"\n��� : "+avg 
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
}
