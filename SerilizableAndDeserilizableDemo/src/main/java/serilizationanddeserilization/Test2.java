package serilizationanddeserilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test2{
	public static void main(String[] args) {
		User  u=new User();
		System.out.println(u.id+" "+u.name+" "+u.password);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\xyz2.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(u);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
