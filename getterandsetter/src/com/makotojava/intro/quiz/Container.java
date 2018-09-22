package com.makotojava.intro.quiz;
import java.io.Serializable;
public class Container implements Serializable {
    
	   private String name;
	   private String anotherName;
	   private Contained contained;
	    
	   public Container(String name) {
	      this.name = name;
	      this.anotherName = name;
	      this.contained = new Contained("Contained:" + name);
	   }
	 
	   public String getName() {
	      return name;
	   }
	 
	   public Contained getContained() {
	      return contained;
	   }
	 
	}
