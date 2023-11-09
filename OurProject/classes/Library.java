package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;

public class Library implements IReaderOperations, IEmployeeOperations, IBookShopOperations
{
	private Reader readers[] = new Reader[500];
	private Employee employees[] = new Employee [100];
	private Book books[] = new Book[100];

	public boolean insertReader(Reader c)
	{
		boolean flag = false;
		for(int i=0; i<readers.length; i++)
		{
			if(readers[i] == null)
			{
				readers[i] = c;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeReader(Reader c)
	{
		boolean flag = false;
		for(int i=0; i<readers.length; i++)
		{
			if(readers[i] == c)
			{
				readers[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Reader searchReader(int nid)
	{
		Reader c = null;
		
		for(int i=0; i<readers.length; i++)
		{
			if(readers[i] != null)
			{
				if(readers[i].getNid() == nid)
				{
					c = readers[i];
					break;
				}
			}
		}
		return c;
	}
	public void showAllReaders()
	{	
		for(int i=0; i<readers.length; i++)
		{
			if(readers[i] != null)
			{
				readers[i].showDetails();
				readers[i].showAllAccounts();
				System.out.println();
			}
		}
	}
		
	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	public void showAllEmployees()
	{
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("\t\tEmployee Id: " + employees[i].getEmpId());
				System.out.println("\t\tEmployee Name: " + employees[i].getName());
				System.out.println("\t\tEmployee Salary: " + employees[i].getSalary());
				System.out.println();
				break;
			}
			else
			{
				System.out.println("\t\tNo employee availabe right now");
				System.out.println();
				break;
			}
		}
	}

	public boolean insertBook(Book b)
	{
		boolean bool = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i]==null)
			{
				// System.out.print("At index ["+i+"] ");
				books[i]=b;
				bool=true;
				break;
			}
		}
		return bool;
	}

	public boolean removeBook(Book b)
	{
		boolean bool = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i]==b)
			{
				// System.out.print("From index ["+i+"] ");
				books[i]=null;
				bool=true;
				break;
			}
		}
		return bool;
	}
	
	public void showAllBooks()
	{
		for(int i=0; i<books.length; i++)
        {
            if(books[i]!=null)
            {
                System.out.println(" ");
                // System.out.println("Book reserved at ["+i+"] index");
                books[i].showDetails();
                System.out.println(" ");
            }
            else
            {
            	System.out.println("\t\t\tNo Book availabe!!!");
            	System.out.println("\t\t-------------------------------------------------------------------------------");
				System.out.println("\t\t-------------------------------------------------------------------------------");
            	break;
            }
            
        }
	}

	public Book searchBook(String isbn)
	{
		Book bb = null;
		// boolean bool=false;
		for(int i=0; i<books.length; i++)
        {
            if(books[i]!=null)
            {
                if(books[i].getIsbn().equals(isbn))
                {
                    bb=books[i];
                    // bool=true;
                    break;
                }
            }
        }
        return bb;
	}

}