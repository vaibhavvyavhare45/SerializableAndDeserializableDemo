package serilizationanddeserilization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable{
	int id=101;
	String name="vaibhav";
	transient String password="vaibhav@12";

	public User() {
		super();
	}

	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
	private void writeObject(ObjectOutputStream o) throws Exception {
		
		//try {
		
		
		
			o.defaultWriteObject();
			String epwd="123"+password;
			o.writeObject(epwd);
			
			
			
			
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
		
//		try {
//			o.writeUTF(name);
//			o.writeUTF("abc" + password + 123);
//			o.writeInt(id);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	private void readObject(ObjectInputStream i)throws Exception {
		
		i.defaultReadObject();
		String epwd=(String)i.readObject();
		password=epwd.substring(3);
		
		
		
		
		
//		try {
//			name = i.readUTF();
//		  String pwd = i.readUTF();
//			password = pwd.substring(3, pwd.length() - 3);
//			id = i.readInt();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

}
