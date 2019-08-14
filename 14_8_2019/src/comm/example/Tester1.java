package comm.example;
import java.util.Arrays;
import java.util.Scanner;
public class Tester1 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	
		 
		Person per=new Person();
	
		try
		{
			/*System.out.println("Please enter length of String array"); 
			int length = sc.nextInt(); 
	
			String[] input = new String[length]; 
			for (int i = 0; i < length; i++) 
			{ 
				String userInput = sc.next(); 
			input[i] = userInput;
			}
			System.out.println(Arrays.toString(input));*/
			per.createMthd("Serma", "Kani");
			System.out.println(per.toString());
			
		}
		catch(MisMatchException e)
		{
			System.out.println(e.getName());
		}
			
			
	}

}
