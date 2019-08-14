package comm.example;
import java.io.Serializable;
public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accnum;
	public int amt;
	public Account()
	{
		
	}
	public Account(String accnum, int amt) {
		this.accnum=accnum;
		this.amt=amt;
		// TODO Auto-generated constructor stub
	}
	public String getAccnum() {
		return accnum;
	}
	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	@Override
	public String toString()
	{
		return "account"+accnum+"amount"+amt;
	}
	public Account createNewAccount(String accnum,int amt)throws AccountNotValidException
	{
		this.accnum=accnum;
		this.amt=amt;
		if(amt<10000)
		{
			throw new AccountNotValidException("not a valid acc");
		}
		return new Account(accnum,amt);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accnum == null) ? 0 : accnum.hashCode());
		result = prime * result + amt;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accnum == null) {
			if (other.accnum != null)
				return false;
		} else if (!accnum.equals(other.accnum))
			return false;
		if (amt != other.amt)
			return false;
		return true;
	}
	
}
