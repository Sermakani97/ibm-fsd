package comm.example;

public class AddArgs {
public static void main(String[] args)
{
	int sum=0;
	for(String a:args)
	{
		try {   
		sum+=Integer.parseInt(a);
		System.out.println(args[1]);
		}
	/*catch(NumberFormatException nfe)
	{
		//System.err.println(nfe.toString());
		//System.err.println(nfe.getCause().toString());
		//nfe.printStackTrace();
		System.err.println(nfe.getMessage());
		System.exit(0);
	}*/
		/*catch(ArrayIndexOutOfBoundsException aobe)
		{
			System.out.println("array not found");
			System.exit(0);
		}*/
		catch(Exception e)
		{
			System.err.println("exception");
		}
		finally {
			System.out.println("finally");
		}
		}
	System.out.println("sum"+sum);
}
}
