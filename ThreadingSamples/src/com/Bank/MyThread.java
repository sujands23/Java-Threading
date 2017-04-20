package com.Bank;

public class MyThread extends Thread{
	
	Account acc;
	String accountOperation;
	int operationAmount;
	
	public MyThread(Account acc, String accountOperation){
		this.acc=acc;
		this.accountOperation=accountOperation;
	}
	
	public MyThread(Account acc, String accountOperation, int operationAmount){
		this.accountOperation=accountOperation;
		this.operationAmount=operationAmount;
		this.acc=acc;
	}
	
	public void run(){
		
		if(accountOperation=="deposit"){
			acc.deposit(operationAmount);
		}
		else if(accountOperation=="withdraw"){
			acc.withdraw(operationAmount);
		}
		else if(accountOperation=="getBalance"){
			acc.getBalance();
		}
	}
}
