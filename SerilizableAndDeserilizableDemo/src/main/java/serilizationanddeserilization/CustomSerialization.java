package serilizationanddeserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class CustomSerialization implements Serializable {
	public static void main(String[] args) {
		//User u1=new User(101,"vaibhav","vaibh@12");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\xyz2.txt");
			ois = new ObjectInputStream(fis);
			User u2 = (User) ois.readObject();
			System.out.println(u2.id+" "+u2.name+" "+u2.password );

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
