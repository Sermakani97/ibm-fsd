package comm.example;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args)
	{
	Set<Student>set=new TreeSet<Student>();	
	set.add(new Student("A","B",2.9));
	set.add(new Student("A","B",4));
	set.add(new Student("A","B",3.4));
	
	
	
Object[] obj=set.toArray();
Student s=null;
for(Object o:obj)
{
	s=(Student)o;
	System.out.printf("name:%s%s GPA:%1f", s.getFirstName(),s.getLastName(),s.getGPA());
}
}}
