package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(113, 115);
		Circle c01 = new Circle(5);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		Point p04 = p02;
		//pList.add(c01); Point가 아니어서 Circle은 담기지 않음
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		
		
		//pList.remove(1); 방번호
		pList.remove(p03); //주소값
		System.out.println("\n===============\n");
		for(int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("\n===============\n");
		System.out.println(pList.toString()); // Point toString()이랑 구분할 것**
		
		
		System.out.println("\n===============\n");
		//for 다른 표현법 --> 향상된 for문
		for(Point p : pList) {
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		
		
		System.out.println("\n===============\n");
		//p04를 2번째(방번호 1번[1])에 추가
		//pList.add(04);
		pList.add(1, p04);
		System.out.println(pList.toString());
		
	}

}
