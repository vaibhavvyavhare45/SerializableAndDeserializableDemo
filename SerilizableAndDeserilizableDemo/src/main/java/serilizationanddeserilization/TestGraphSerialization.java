package serilizationanddeserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestGraphSerialization {
	public static void main(String[] args) {

		Account a = new Account(1001, "ram");
		Bank b = new Bank(101, "SBI", a);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(
					"D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\serilizationanddeserilization\\agg.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(b);

			System.out.println("Serialization is successfully..." + b);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
