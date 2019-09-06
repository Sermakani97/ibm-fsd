package bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressImpl implements Address {
@Value("pallikaranai")
	private String add1;
@Value("chennai")
	private String add2;
@Value("23445")
	private int contact;
	
public AddressImpl()
{
	
}
public AddressImpl(String add1,String add2,int contact)
{
	this.add1=add1;
	this.add2=add2;
	this.contact=contact;
}
	
	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getAddress() {
		// TODO Auto-generated method stub
		return "add1"+add1+"add2"+add2+"contact"+contact;

	}
	@Override
	public String toString() {
		return "AddressImpl [add1=" + add1 + ", add2=" + add2 + ", contact=" + contact + "]";
	}

}
