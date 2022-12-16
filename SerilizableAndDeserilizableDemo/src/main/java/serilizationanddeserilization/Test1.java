package serilizationanddeserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
Cat c=new Cat();

@Override
public String toString() {
	return "Dog [c=" + c + "]";
}	

}
class Cat implements Serializable{
Rat r=new Rat();

@Override
public String toString() {
	return "Cat [r=" + r + "]";
}	


}
class Rat implements Serializable {
	int i=78;

	@Override
	public String toString() {
		return "Rat [i=" + i + "]";
	}
	
}



public class Test1 implements Serializable {
	public static void main(String[] args) {
		Dog d=new Dog();
		
		try {
			FileOutputStream fos =new FileOutputStream("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\xyz2.txt");
			
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(d);
				System.out.println("Serializtion is successfully.."+d);
				System.out.println(d.c.r.i);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis=new FileInputStream("D:\\Vaibhtz45\\SerilizableAndDeserilizableDemo\\src\\main\\java\\xyz2.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Dog d1=(Dog)ois.readObject();
			System.out.println("Deserialization is successfully..."+d1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
