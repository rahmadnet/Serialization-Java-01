package Seraliation_Java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SendClass 
{
	public static void main(String[] args) 
	{
		Student student = new Student(100, 12, "lili", "demak",9 );
		try {
			FileOutputStream fos = new FileOutputStream("Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(student);
			oos.close();
			fos.close();
			System.out.println("Serialization Done!!");
		} 
		catch (IOException ioe) 
		{
			System.out.println(ioe);
		}
	}
}
