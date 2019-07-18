package Seraliation_Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AcceptClass 
{

	public static void main(String[] args) 
	{
		Student o = null;
		try {
			FileInputStream fis = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = (Student)ois.readObject();
			ois.close();
			fis.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
			return;
		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Student Class is not found.");
			cnfe.printStackTrace();
			return;
		}
		System.out.println("Name    : " + o.getName());
		System.out.println("Age     : " + o.getAge());
		System.out.println("Roll No : " + o.getRollNum());
		System.out.println("Address : " + o.getAddress());
		System.out.println("Height  : " + o.getHeight());
	} 

}
