package serilizationanddeserilization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class User1 implements Externalizable{
	private  int id;
	private String name;
	
	
	public User1() {
		super();
	}


	public User1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + "]";
	}


	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);
		
	}


	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		 name=(String) in.readObject();
		id=in.readInt();
		
	}
	
	

}
