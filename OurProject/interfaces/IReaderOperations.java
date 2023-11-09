package interfaces;
import java.lang.*;
import classes.*;
public interface IReaderOperations
{
	public boolean insertReader(Reader r);
	public boolean removeReader(Reader r);
	public Reader searchReader(int nid);
	public void showAllReaders();

}