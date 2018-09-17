package getterandsetter;
	import java.util.*;
public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	private String eyecolor;
	private String gender;
	
	public Person() {
		this.name = "Pamilerin";
		this.age = 22;
		this.height = 170;
		this.weight = 50;
		this.eyecolor = "black";
		this.gender = "MALE";
	}
	
	public Person (String name, int age, int height, int weight, String eyecolor, String gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyecolor = eyecolor;
		this.gender = gender;
			
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", eyecolor="
				+ eyecolor + ", gender=" + gender + "]";
	}
	}

