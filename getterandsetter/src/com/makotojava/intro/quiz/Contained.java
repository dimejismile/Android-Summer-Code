package com.makotojava.intro.quiz;
import java.io.Serializable;

public class Contained implements Serializable {
 
   private String name;
    
   public Contained(String name) {
      this.name = name;
   }
 
   public String getName() {
      return name;
   }
 
}