package comm.example;

public class MisMatchException extends Throwable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
public MisMatchException()
{
	super();
	
}
public MisMatchException(String name)
{
	super();
	this.name=name;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
