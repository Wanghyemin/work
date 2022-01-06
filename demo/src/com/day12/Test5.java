package com.day12;

import java.util.Vector;

// Collection Framework (방법론)

// 배열의 단점
// 1. 크기를 정하면 변경이 불가능
// 2. 미리 크게 잡으면 메모리 낭비가 될 수 있음
// 3. 배열 사이에 삽입이 불가능

// List, Vector, Set, Map, Hashtable, TreeSet, HashSet

// List(I) - ArrayList(C) 동기화X , Vector(C) 동기화 O
// Map(I) - Hashtable(C), HashSet(C)

public class Test5 {

	public static void main(String[] args) {

		Vector v = new Vector<>(); // 기본 데이터 type이 Object 이다

		v.add("서울"); // UPCAST
		v.add(30);
		v.add('c');

		String s = (String) v.get(0);
		System.out.println(s);

		Integer i = (Integer) v.get(1);
		System.out.println(i);

		char c = (char) v.get(2);
		System.out.println(c);

	}

}
