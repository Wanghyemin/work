package com.day12;

import java.util.Vector;

class Test{
	
	String name;
	int age;
	
}

public class Test8 {

	public static void main(String[] args) {

		Vector<Test> v = new Vector<>();
		
		Test ob;
		ob = new Test();
		ob.name = "배수지";
		ob.age = 27;
		v.add(ob);
		
		ob = new Test();
		ob.name = "유인나";
		ob.age = 41;
		v.add(ob);
		
		for(Test t : v) {
			
			System.out.println(t.name + ":" +t.age);
		}
		
		
		
	}

}
