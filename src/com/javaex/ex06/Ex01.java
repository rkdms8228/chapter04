package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		//미니로또
		//set 생성
		Set<Integer> iset = new HashSet<Integer>();
		
		Integer set1, set2, set3, set4, set5, set6;
		
		
		set1 = (int)(Math.random()*45)+1;
		set2 = (int)(Math.random()*45)+1;
		set3 = (int)(Math.random()*45)+1;
		set4 = (int)(Math.random()*45)+1;
		set5 = (int)(Math.random()*45)+1;
		set6 = (int)(Math.random()*45)+1;
		
		
		iset.add(set1);
		iset.add(set2);
		iset.add(set3);
		iset.add(set4);
		iset.add(set2);
		iset.add(set6);
			

		System.out.println(iset.toString());
		
		
		System.out.println("\n===============\n");
		
		////////////////////////////////////////////////////
		//강사님 버전
		
		//set 생성
		Set<Integer> iSet = new HashSet<Integer>();
		
		//반복
		while (true) {

			if (iSet.size() >= 6) {
				break;
			}

			// 번호를 생성한다
			int num = (int) (Math.random() * 45) + 1;
			System.out.println(num);

			// set에 add한다
			iSet.add(num);

		}

		System.out.println("===========================");
		for (Integer num : iSet) {
			System.out.print(num + "\t");
		}

	}

}
