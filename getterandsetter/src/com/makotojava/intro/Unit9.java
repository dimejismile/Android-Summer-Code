package com.makotojava.intro;
import java.util.logging.Logger;

public class Unit9 {

		Logger l = Logger.getLogger(Unit9.class.getName());
		private String name;
		private int age;
		private int height;
		private int weight;
		private String eyecolor;
		private String gender;
		
		public Unit9 (String name, int age, int height, int weight, String eyecolor, String gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyecolor = eyecolor;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
