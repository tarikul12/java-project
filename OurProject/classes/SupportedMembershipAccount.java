package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;

public class SupportedMembershipAccount extends Account
{
	private double discountRate;

	public SupportedMembershipAccount(int accountNumber, String accountHolderName, double balance, double discountRate)
	{
		super(accountNumber,accountHolderName, balance);
		this.discountRate=discountRate;
	}
	public void setdiscountRate(double discountRate)
	{
		this.discountRate=discountRate;
	}
	public double getdiscountRate(){return discountRate;}
	public void showDetails()
	{
		System.out.println("\t\tThis is a Supported Membership Account");
		System.out.println("\t\tAccount Number : "+getAccountNumber());
		System.out.println("\t\tBalance : "+getBalance());
		System.out.println("\t\tDiscount Rate : "+getdiscountRate());
	}

}