package com.lec.ex03_point;

public class Point3D extends Point {
	private int z;
	public void point3dPrint() {
		//System.out.println("3���� ��ǥ : "+getX()+","+getY()+","+z);
		System.out.printf("3���� ��ǥ: %d,%d,%d\n" , getX(),getY(),z);
	}
	public String point3DInfoString() {
		return ("3���� ��ǥ : "+getX()+","+getY()+","+z);
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}
