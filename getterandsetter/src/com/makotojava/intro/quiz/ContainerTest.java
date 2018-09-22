package com.makotojava.intro.quiz;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class ContainerTest {

	@Test
	void testContainer() {
		fail("Not yet implemented");
	}
	private static final Logger log = Logger.getLogger(ContainerTest.class.getName());
	 
	   @Test
	   public void testContainer_Problem6() {
	      Container container = new Container("Some name");
	      String file = "Container.ser";
	      // Write the file out
	      try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
	         outputStream.writeObject(container);
	      } catch (IOException e) {
	         log.severe("IOException occurred: " + e.getLocalizedMessage());
	         e.printStackTrace();
	      }
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
