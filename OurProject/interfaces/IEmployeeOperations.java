package interfaces;
import java.lang.*;
import classes.*;
public interface IEmployeeOperations 
{
	boolean insertReader(Reader r);
	boolean removeReader(Reader r);
	Reader searchReader(int nid);
	void showAllReaders();	
}