package interfaces;
import java.lang.*;
import classes.*;
public interface IReaderMembershipTransactions
{
	boolean renewMembership(double amount); 
	boolean removeMembership(double amount);

}