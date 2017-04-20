package com.Bank;

public class Account {
	String userName;
	String password;
	int balance;
	
	public Account(String userName,String password){
		if(userName=="Sujan"){
			this.userName=userName;
		}
		if(password=="Sujan"){
			this.password=password;
		}
	}
	
	public synchronized int getBalance(){
		System.out.println(Thread.currentThread().getName()+"------ Balance of account : "+userName+" is : "+balance);
		return balance;
	}
	
	public synchronized int deposit(int depositAmt){
		balance=balance+depositAmt;
		System.out.println(Thread.currentThread().getName()+"------ Amount "+depositAmt+" deposited successfully! New balance is : "+balance);
		return balance;
	}
	
	public synchronized int withdraw(int withdrawAmt){
		if(withdrawAmt>balance){
			System.out.println(Thread.currentThread().getName()+"------ Low balance");
			return 0;
		}
		else{
			balance=balance-withdrawAmt;
			System.out.println(Thread.currentThread().getName()+"------ Amount "+withdrawAmt+" withdrawn successfully! Current balance is : "+balance);
			return balance;
		}
	}
}