package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iset = new HashSet<Integer>();
		
		
		//int i = 12;
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;
		
		
		
		iset.add(i01);
		iset.add(i02);
		iset.add(i03);
		
		
		System.out.println(iset.size());
		System.out.println(iset.toString());
		
		System.out.println("\n===============\n");
		
		//모든 값 출력
		for(Integer num : iset) {
			System.out.println(num.toString());
		}
		
		System.out.println("\n===============\n");
		
		//중복 체크
		Integer i04 = 5; //값을 동일하게 주었을 때
		iset.add(i04);
		
		System.out.println(iset.size());
		System.out.println(iset.toString());
		
		System.out.println("\n===============\n");
		
		//모든 값 출력
		for(Integer num : iset) {
			System.out.println(num.toString());
		}
		
	}

}
