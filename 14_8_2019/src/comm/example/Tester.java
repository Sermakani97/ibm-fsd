package comm.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tester {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{//String accnum=null;
	//int amt=0;
		Account acc=new Account("SBI",5000);
		Account acc1=new Account("SBI",5000);
		
		try {
			/*System.out.println("enter the accnum");
			accnum=sc.next();
			System.out.println("enter the amt");
			amt=sc.nextInt();*/
		
		
			//acc.createNewAccount("SBI", 5000);
			//acc1.createNewAccount("iob", 2000);
			if(acc.equals(acc1))
			{
				throw new ObjectsimilarException("already exist");
			}
		
			
			System.out.println(acc.toString());
	}
		catch(ObjectsimilarException e)
		{
			System.err.println(e.getMsg());
		}
		/*catch(AccountNotValidException e)
		{
			System.out.println(e.getMsg() );
		}
		catch(InputMismatchException e)
		{
			System.out.println("input mismatch");
		}*/
	}

}
