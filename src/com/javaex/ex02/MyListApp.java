package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList pList = new MyList();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).toString());
		
		
		System.out.println("\n================\n");
		for(int i = 0; i<pList.size(); i++) {
			//System.out.println(pList.get(i).toString());
			Point p = (Point)pList.get(i); //다운캐스팅
			System.out.println(p.getX());
		}
		
		
		
		/////////////////////////////////////
		//Circle 관리
		MyList cList = new MyList();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(13);
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i = 0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			System.out.println( ((Circle) cList.get(i)).getRadius() ); 	//다운캐스팅
		}

	}

}
