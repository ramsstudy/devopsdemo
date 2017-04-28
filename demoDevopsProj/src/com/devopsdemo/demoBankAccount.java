package com.devopsdemo;

public class demoBankAccount {

	private double balance;
	
	public demoBankAccount(double balance)  {
		
		this.balance=balance;
	}
	
	public double debit(double amount) {
		
		if (balance < amount) {
		
		  	amount = balance;
		}
		
			balance =amount;
			
			return amount;
	  			
	}
	
	
	public static void main(String[] args) {
		
		demoBankAccount db = new demoBankAccount(100.00);
		double approvedDebit = db.debit(100);
		System.out.println("Approved Debit amount is  : " + approvedDebit);
		
	}
	
	
	
}
