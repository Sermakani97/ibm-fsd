package comm.example.p1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class CollectionDemo {
	static Scanner sc=new Scanner(System.in);
	private String str[];
	private Set<String> set;
public CollectionDemo() throws InputMismatchException
{
	System.out.print("Number of elements:");
	str=new String[sc.nextInt()];
	for(int i=0;i<str.length;i++)
	{
		System.out.println("Name:");
		str[i]=sc.next().toString().toLowerCase();
	}
	set=new HashSet();
	for(String s:str)
	{
		if(!set.add(s))
		{
	System.out.println("Duplicate element not found"+s);		
		}
	}
}
public void displayCollection()
{
	Iterator i=set.iterator();
while(i.hasNext()) {
	System.out.println(i.next().toString());
	
}
}
}
