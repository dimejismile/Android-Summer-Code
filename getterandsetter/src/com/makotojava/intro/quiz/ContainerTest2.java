package com.makotojava.intro.quiz;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class ContainerTest2 {

	private static final Logger log = Logger.getLogger(ContainerTest.class.getName());
	 
	
	   @Test
	   public void testContainer_Problem7() {
	      Container container = new Container("Some name");
	      String file = "Container.ser";
	      // Now read the file back in
	      try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
	         container = (Container)inputStream.readObject();
	         assertEquals("Some name", container.getName());
	         assertEquals("Contained:Some name", container.getContained().getName());
	      } catch (IOException e) {
	         log.severe("IOException occurred: " + e.getLocalizedMessage());
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	         log.severe("ClassNotFoundException occurred: " + e.getLocalizedMessage());
	         e.printStackTrace();
	      }
	   }
	 
	
	@Test
	void testContainer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetContained() {
		fail("Not yet implemented");
	}

}
