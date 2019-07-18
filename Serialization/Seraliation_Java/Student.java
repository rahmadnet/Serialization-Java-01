package Seraliation_Java;

import java.io.Serializable;

public class Student implements Serializable
{
	private int rollNum;
	private int age;
	private String name;
	private transient String address;
	private transient int height;
	
	public Student(int roll, int age, String name, String address, int height)
	{
		this.rollNum = roll;
		this.age = age;
		this.name = name;
		this.address = address;
		this.height = height;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
