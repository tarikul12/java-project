package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;
public class TextBook extends Book{
	private int standard;

	
	public TextBook()
	{
		
	}

	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.standard = standard;
		
	}

	
	public void setStandard(int standard)
	{
		this.standard = standard;
	}
	
	public int getStandard()
	{
		return standard;
	}

	@Override
	public void showDetails()
	{
		System.out.println("\t\tThis is a Text Book");
		System.out.println("\t\tIsbn is : "+isbn);
		System.out.println("\t\tBook Title is : "+bookTitle);
		System.out.println("\t\tAuthor Name : "+authorName);
		System.out.println("\t\tPrice is : "+price);
		System.out.println("\t\tavailable Quantity : "+availableQuantity);
		System.out.println("\t\tStandard : "+standard);
	}


}