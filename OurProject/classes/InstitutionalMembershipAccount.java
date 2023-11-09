package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;

public class InstitutionalMembershipAccount extends Account
{
	private double inmembershipDuration;

	public InstitutionalMembershipAccount(int accountNumber, String accountHolderName, double balance, double inmembershipDuration)
	{
		super(accountNumber,accountHolderName, balance);
		this.inmembershipDuration=inmembershipDuration;
	}

	public void setinmembershipDuration(double inmembershipDurationin)
	{
		this.inmembershipDuration=inmembershipDuration;
	}
	public double getinmembershipDuration(){return inmembershipDuration;}
	public void showDetails()
	{
		System.out.println("\t\tThis is a Institutional Membership Account");
		System.out.println("\t\tAccount Number : "+getAccountNumber());
		System.out.println("\t\tBalance : "+getBalance());
		System.out.println("\t\tInstitutional Membership Duration : "+getinmembershipDuration());
	}

}