package com.day6;

public class Demo {
	
	public static int a = 10; 
	
	private int b = 20; 
	
	public void write(){
		System.out.println("class변수a: "+a);
		System.out.println("instance변수 b: "+b);
	}
	
	public static void print() {
		System.out.println("class 변수a: "+a);
	}

	
	
	public static void main(String[] args) {
		
		System.out.println("class변수: "+a);
		System.out.println("class변수: "+Demo.a);
		
		print();
		Demo.print();
		
		Demo dd = new Demo();
		System.out.println("class 변수: "+ dd.a);
		System.out.println("instance 변수b: "+dd.b);
		dd.print();
		dd.write();
		
		
		
	}
}