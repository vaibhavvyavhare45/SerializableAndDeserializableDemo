package serilizationanddeserilization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	
	public static void main(String[] args) {
		Employee e=new Employee();
		File f=new File("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\abc.txt");
		try {
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			System.out.println("serilize succsessfully.. ");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
