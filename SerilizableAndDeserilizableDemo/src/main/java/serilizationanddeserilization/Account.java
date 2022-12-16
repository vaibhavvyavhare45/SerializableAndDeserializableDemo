package serilizationanddeserilization;

import java.io.Serializable;

public class Account implements Serializable {
	int accno;
	String ahname;
	public Account() {
		super();
	}
	public Account(int accno, String ahname) {
		super();
		this.accno = accno;
		this.ahname = ahname;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", ahname=" + ahname + "]";
	}
	
	
}
