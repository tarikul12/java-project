package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;
public class StoryBook extends Book{
	private String category;

	//default constructor
	public StoryBook()
	{
		// System.out.println("calling Empty constructor of StoryBook[Child class] class !!!");
	}

	//setting data with parameterized constructor 
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, 
	String category)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.category = category;
		// System.out.println("calling parameterized constructor of StoryBook[Child class] class !!!");
	}

	//setting data with set method
	public void setCategory(String category)
	{
		this.category = category;
	}
	//getting data with get method
	public String getCategory()
	{
		return category;
	}

	//printing all data
	@Override
	public void showDetails()
	{
		System.out.println("\t\tThis is a story Book");
		System.out.println("\t\tIsbn is : "+isbn);
		System.out.println("\t\tBook Title is : "+bookTitle);
		System.out.println("\t\tAuthor Name : "+authorName);
		System.out.println("\t\tPrice is : "+price);
		System.out.println("\t\tAvailable Quantity : "+availableQuantity);
		System.out.println("\t\tCategory is : "+category);
	}


}