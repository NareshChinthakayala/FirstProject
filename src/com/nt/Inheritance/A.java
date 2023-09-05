package com.nt.Inheritance;

public class A {
static int a=10;
private int b=20;
protected int c=30;
public int d=88;
}
class B extends A{
	static int x=90;
	private int y=20;
	
}
class Test01{
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.c);
	}
}
