package comm.example;

public class AccountNotValidException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public AccountNotValidException() {
		super();
	}
	public AccountNotValidException(String msg)
	{
		super();
		this.setMsg(msg);
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
