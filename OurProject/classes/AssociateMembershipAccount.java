package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;

public class AssociateMembershipAccount extends Account
{
	private double asmembershipDuration;

	public AssociateMembershipAccount(int accountNumber, String accountHolderName, double balance, double asmembershipDuration)
	{
		super(accountNumber,accountHolderName, balance);
		this.asmembershipDuration=asmembershipDuration;
	}
	public void setasmembershipDuration(double asmembershipDuration)
	{
		this.asmembershipDuration = asmembershipDuration;
	}
	public double getasmembershipDuration(){return asmembershipDuration;}
	public void showDetails()
	{
		System.out.println("\t\tThis is a Associate Membership Account");
		System.out.println("\t\tAccount Number : "+getAccountNumber());
		System.out.println("\t\tBalance : "+getBalance());
		System.out.println("\t\tAssociate Membership Duration : "+getasmembershipDuration());
	}

}