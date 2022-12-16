package serilizationanddeserilization;

import java.io.Serializable;

public class Bank implements Serializable {
	int bid;
	String bname;
	Account ac;
	
	
	public Bank() {
		super();
	}


	public Bank(int bid, String bname, Account ac) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.ac = ac;
	}


	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", bname=" + bname + ", ac=" + ac + "]";
	}
	
	
	
	
	
	
	

}
