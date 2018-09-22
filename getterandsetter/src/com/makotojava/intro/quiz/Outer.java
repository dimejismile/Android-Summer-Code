package com.makotojava.intro.quiz;

import java.util.logging.Logger;

public class Outer {
	// Unit 18 Question 3
	private static final Logger log = Logger.getLogger(Outer.class.getName());
	public void setInner(Inner inner) { 
		this.inner = inner; } 
	
	private Inner inner; 
	public Inner getInner() { 
		return inner; } 
	
	//Our Nested class 'Inner'
	private class Inner {
		
	} public static void main(String[] args) { 
		Outer outer = new Outer(); 
		Inner inner = outer.new Inner(); 
		outer.setInner(inner); 
		log.info("Outer/Inner: " + outer.hashCode() + "/" + outer.getInner().hashCode());
	}

}
