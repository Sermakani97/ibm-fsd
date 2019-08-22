package comm.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
public static void main(String[] args) throws IOException
{
	File ifile=new File("FileInputOutput");
	File ofile=new File("FileStream");
	FileInputStream in=new FileInputStream(ifile);
	FileOutputStream out=new FileOutputStream(ofile);
	int c;
	while((c=in.read())!=-1) {
		System.out.println(c);
		out.write(c);
		
	}
	
	System.out.println("FileInputStream is used to read a file and  FileOutputStream is used to write a file");
	
}
}
