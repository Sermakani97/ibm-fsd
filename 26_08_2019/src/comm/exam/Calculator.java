package comm.exam;

public class Calculator {
	private int x;
	private int y;
	private int result;
public Calculator()
{
	super();
}
public Calculator(int x,int y)
{
	this.x=x;
	this.y=y;
}
public int add()
{
	
	result=x+y;
	return result;
}
public int great()
{
	if(x>y)
		return 1;
	else
		return -1;
}
}
