package com.makotojava.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Employee extends Person {
	
	private static final Logger logger = Logger.getLogger(Employee.class.getName()); 
	//. . . 
	public static Logger getLogger() { 
		return logger; }
	
	private String taxpayerIdentificationNumber; 
	private String employeeNumber; 
	private BigDecimal salary; 
	
	
	//Creating getters and setters for employee attributes
	public String getTaxpayerIdentificationNumber() {
		return taxpayerIdentificationNumber; }
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) { 
		this.taxpayerIdentificationNumber = taxpayerIdentificationNumber; }
	
	//End of Creating getters and setters for employee attributes
	
	public Employee(String name, int age, int height, int weight, String eyeColor, String gender) {
		super(name, age, height, weight, eyeColor, gender);
	}

	//Override Methods
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Logger getL() {
		// TODO Auto-generated method stub
		return super.getL();
	}

	@Override
	public void setL(Logger l) {
		// TODO Auto-generated method stub
		super.setL(l);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return super.getWeight();
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		super.setWeight(weight);
	}

	@Override
	public String getEyeColor() {
		// TODO Auto-generated method stub
		return super.getEyeColor();
	}

	@Override
	public void setEyeColor(String eyeColor) {
		// TODO Auto-generated method stub
		super.setEyeColor(eyeColor);
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return super.getGender();
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		super.setGender(gender);
	}

	@Override
	public void printAudit(StringBuilder buffer) {
		// TODO Auto-generated method stub
		super.printAudit(buffer);
		buffer.append(toString());
		
		// Now format this instance's values 
		buffer.append("TaxpayerIdentificationNumber="); 
		buffer.append(getTaxpayerIdentificationNumber()); 
		buffer.append(","); 
		buffer.append("EmployeeNumber="); 
		buffer.append(getEmployeeNumber()); 
		buffer.append(","); 
		buffer.append("Salary="); 
		buffer.append(getSalary().setScale(2).toPlainString());}
	
	
	@Override
	public void printAudit(Logger l) {
		// TODO Auto-generated method stub
		super.printAudit(l);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeNumber == null) {
			if (other.employeeNumber != null)
				return false;
		} else if (!employeeNumber.equals(other.employeeNumber))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (taxpayerIdentificationNumber == null) {
			if (other.taxpayerIdentificationNumber != null)
				return false;
		} else if (!taxpayerIdentificationNumber.equals(other.taxpayerIdentificationNumber))
			return false;
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result
				+ ((taxpayerIdentificationNumber == null) ? 0 : taxpayerIdentificationNumber.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Employee [taxpayerIdentificationNumber=" + taxpayerIdentificationNumber + ", employeeNumber="
				+ employeeNumber + ", salary=" + salary + ", l=" + l + ", getTaxpayerIdentificationNumber()="
				+ getTaxpayerIdentificationNumber() + ", getEmployeeNumber()=" + getEmployeeNumber() + ", getSalary()="
				+ getSalary() + ", getL()=" + getL() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getEyeColor()=" + getEyeColor()
				+ ", getGender()=" + getGender() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";

}
}