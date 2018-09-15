package com.makotojava.intro;

import java.util.logging.Logger;

public class Person {
	Logger l = Logger.getLogger(Person.class.getName());
	
	//private String name
	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int weight;
	private String eyecolor;
	private String gender;
	
public Person (String firstName, String lastName, int age, int height, int weight, String eyecolor, String gender) {
	this.firstName= firstName;
	this.lastName= lastName;
	this.age = age;
	this.height = height;
	this.weight = weight;
	this.eyecolor = eyecolor;
	this.gender = gender;
}
	//Concatenation Exercise
	public String getFirstName() {
	return firstName;
}

	public void setFirstName(String firstName) {
	this.firstName = firstName;
}

	public String getLastName() {
	return lastName;
}

	public void setLastName(String lastName) {
	this.lastName = lastName;
}
	public String getFullName() {
		return getFirstName().concat(" ").concat(getLastName());
	}

	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEyecolor() {
		return eyecolor;
	}
	public void setEyecolor(String eyecolor) {
		this.eyecolor = eyecolor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
