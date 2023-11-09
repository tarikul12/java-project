package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;
public class Reader implements IAccountOperations
{
	private String name;
	private int nid;
	private int age;
	private Account accounts[]=new Account[10];

	public Reader(int nid, String name, int age)
	{
		this.name=name;
		this.nid=nid;
		this.age=age;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getNid()
	{
		return nid;
	}

	public int getAge()
	{
		return age;
	}

	public void showDetails()
	{
		System.out.println("\t\tReader Name: " + name);
		System.out.println("\t\tReader NID: " + nid);
		System.out.println("\t\tReader Age: " + age);
		System.out.println();
	}

	public boolean insertAccount(Account a)
	{
		boolean flag = false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeAccount(Account a)
	{
		boolean flag = false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;	
	}
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				accounts[i].showDetails();
				System.out.println();
			}
		}
	}
	public Account searchAccount(int accountNumber)
	{
		Account a = null;
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber() == accountNumber)
				{
					a = accounts[i];
					break;
				}
			}
		}
		return a;
	}
}