package com.devopsdemo;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestdemoBankAccount {

	@SuppressWarnings("deprecation")
	@Test
	public void testdebitWithsufficientFunds() {
	demoBankAccount account = new demoBankAccount(10);
	double amount = account.debit(5);
	Assert.assertEquals(5.0, amount);
	
	}
	
	@Test
	public void testdebitWithInsufficientFunds() {
		demoBankAccount account = new demoBankAccount(10);
		double amount = account.debit(16);
		Assert.assertEquals(10.0, amount);
	}
	
}
