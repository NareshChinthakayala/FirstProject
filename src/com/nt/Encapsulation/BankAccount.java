package com.nt.Encapsulation;

public class BankAccount {
 private double balance;
  public void setBalance(double balance) throws IllegalAccessException {
	  if(balance==0) {
		  throw new IllegalAccessException("do not pass 0");
	  }else if(balance<0) {
		  throw new IllegalAccessException("balance not zoro");
	  }
	  this.balance=balance;
  }
  public double getBalance() {
	return balance;
	  
  }
  
}
