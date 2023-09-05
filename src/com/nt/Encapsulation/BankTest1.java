package com.nt.Encapsulation;

import java.util.Scanner;

import com.nt.Inheritance.A;

public class BankTest1 {
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		Scanner scn=new Scanner(System.in);
		while(true) {
			try {
		System.out.println("enter balance");
		double balance=scn.nextDouble();
		
			
			acc1.setBalance(balance);
			System.out.println(acc1.getBalance());
			break;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		A b=new A();
		System.out.println(b.d);
		
	
		}
	}
	class D extends A{
		int d1=30;
	}
	D d12=new  D();
	

}
