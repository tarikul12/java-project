package interfaces;
import java.lang.*;
import classes.*;
public interface IAccountOperations 
{
	
	boolean insertAccount(Account a);
	boolean removeAccount(Account a);
	Account searchAccount(int accountNumber);
	void showAllAccounts();


}