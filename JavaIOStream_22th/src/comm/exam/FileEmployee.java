package comm.exam;
import java.io.*;
import java.sql.SQLException;
public class FileEmployee {
public static void main(String[] args) throws IOException,SQLException
{
	FileReader in=new FileReader(new File("Text.txt"));
	BufferedReader input=new BufferedReader(in);
	String arr=input.readLine();
	
}
}
