package com.javaex.ex02;

public class MyList {
	
	//필드
	private Object[] oArray;
	private int crtPos; //다음에 추가해 줄 방번호
	
	//생성자
	public MyList() {
		//배열 3개 --> 원래는 만들지 않음
		oArray = new Object[3];
		crtPos = 0;
	}

	//메소드-gs

	//메소드-일반
	public void add(Object object) {
		//현재 배열 갯수+1
		//기존 배열이 내용은 그대로 복사
		//마지막 방에 point를 대입
		
		oArray[crtPos] = object;
		crtPos = crtPos+1; //crtPos++
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}

}
