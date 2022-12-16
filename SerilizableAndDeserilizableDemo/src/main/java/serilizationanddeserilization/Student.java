package serilizationanddeserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	int a=10,b=20;
	transient int c=30;///this variable is not participate in serialization process
	public static void main(String[] args) {
		Student s=new Student();
		try {
			FileOutputStream fos=new FileOutputStream("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\xyz2.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
			System.out.println("Serialization process is succsessfully...");
			
			FileInputStream fis=new FileInputStream("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\xyz2.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student s2=(Student)ois.readObject();
			System.out.println("Deserialization process is succsessfully...");
			System.out.println(s2.a);
			System.out.println(s2.b);
			System.out.println(s2.c);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
