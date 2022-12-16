package serilizationanddeserilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Persion implements Serializable {

	public static void main(String[] args) {

		File f = new File("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\abc.txt");
		try {
			FileInputStream fis = new FileInputStream(f);// reading file
			ObjectInputStream ois = new ObjectInputStream(fis);// reading object
			ois.readObject();// accessing data in file
			System.out.println("Deserilization Process succsessfully...");
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
