package comm.example;

public class ObjectsimilarException extends Throwable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String msg;
public ObjectsimilarException()
{
	super();
}
public ObjectsimilarException(String msg)
{
	super();
	this.msg=msg;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

}
