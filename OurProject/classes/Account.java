package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;
public abstract class Account implements IReaderMembershipTransactions
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public Account(int accountNumber, String accountHolderName, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public abstract void showDetails();

	public boolean renewMembership(double amount)
	{
		boolean flag = false;
		if(amount>0)
		{
			balance = balance + amount;
			flag = true;
		}
		return flag;
	}
	public boolean removeMembership(double amount)
	{
		boolean flag = false;
		if(amount>0 && amount<=balance)
		{
			balance = balance - amount;
			flag = true;
		}
		return flag;
	}

}