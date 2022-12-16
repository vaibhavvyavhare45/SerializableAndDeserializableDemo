package serilizationanddeserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car implements Serializable {
	final transient int i;

	public Car(int i) {
		super();
		this.i = i;
	}

}

class Engine extends Car {

	int j;

	public Engine(int i, int j) {
		super(i);
		this.j = j;
	}

}

public class Demo1 {
	public static void main(String[] args) {
		Engine e = new Engine(10, 20);

		try {
			FileOutputStream fos = new FileOutputStream(
					"D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\xyz2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			System.out.println("Serialization is successfully...");

			FileInputStream fis = new FileInputStream(
					"D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\xyz2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Engine e2 = (Engine) ois.readObject();
			fis.close();
			ois.close();
			System.out.println("Deserialization is succsessfully...");
			System.out.println(e2.i);
			System.out.println(e2.j);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
