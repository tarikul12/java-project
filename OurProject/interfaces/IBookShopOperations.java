package interfaces;
import java.lang.*;
import classes.*;
public interface IBookShopOperations{
	
	public abstract boolean insertBook(Book b); 
	public abstract boolean removeBook(Book b);
	public abstract void showAllBooks(); 
	public abstract Book searchBook(String isbn);
}