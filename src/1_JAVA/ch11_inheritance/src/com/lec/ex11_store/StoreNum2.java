package com.lec.ex11_store;
// 부대찌개-5,000  비빔밥-5,000   공기밥-무료
public class StoreNum2 extends HeadQuarterStore {
	public StoreNum2(String name) {
		super(name);
	}//bude 치고 컨+스페이스 엔터 : @Override.
	@Override  //오버라이드 재정의 : 부모 클래스의 메소드를 재정의 ,오버로드 중복정의 : 매개변수의 수나 타입으로 같은 이름의 함수를 중복정의
	public void bude() {
		System.out.println("부대찌개 5,000원.");
	}
	@Override
	public void bibib() {
		System.out.println("비빔밥 5,000원.");
	}
	@Override
	public void gonggibab() {
		System.out.println("공기밥 무료.");
	}
}
