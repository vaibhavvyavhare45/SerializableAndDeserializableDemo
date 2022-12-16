package serilizationanddeserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestGraphDeSerialization {
	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\serilizationanddeserilization\\agg.txt");
			ois=new ObjectInputStream(fis);
			Bank b2=(Bank)ois.readObject();
			System.out.println("Deseialization is successfully.."+b2);
			
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
		finally {
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
