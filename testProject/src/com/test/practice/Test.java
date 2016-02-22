package com.test.practice;

public class Test {

	public static void main(String[] args) {
		Vehicle v;
		Car c;
		v=new Vehicle();
		c=new Car();
		v.drive();
		c.drive();
		v=c;
		v.drive();
		boolean flag=false;
		if(flag=true){
			System.out.println("true");
			}
		else
			System.out.println("false");
	}

}
