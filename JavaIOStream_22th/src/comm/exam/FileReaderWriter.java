package comm.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;


public class FileReaderWriter {
	public static void main(String[] args) throws IOException
	{
		File ifile=new File("FileInputOutput");
		File ofile=new File("FileStream");
FileReader in=new FileReader(ifile);
		FileWriter out=new FileWriter(ofile);
		BufferedReader inputstream=new BufferedReader(in);
		PrintWriter outputStream=new PrintWriter(out);
		String l;
		while((l=inputstream.readLine())!=null) {
			System.out.println(l);
			out.write(l);
			
		}
		
		System.out.println("FileInputStream is used to read a file and  FileOutputStream is used to write a file");
		
	}
}
