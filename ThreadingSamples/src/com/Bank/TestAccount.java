package com.Bank;

public class TestAccount {

	public static void main(String[] args) {
		
		Account acc=new Account("Sujan", "Sujan");
		
		MyThread t1=new MyThread(acc, "deposit", 100);
		MyThread t2=new MyThread(acc, "withdraw", 20);
		MyThread t3=new MyThread(acc, "withdraw", 35);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}