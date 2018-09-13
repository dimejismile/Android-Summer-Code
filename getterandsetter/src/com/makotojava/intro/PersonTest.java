package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import javax.sound.midi.MidiDevice.Info;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	 void testPerson() {
		Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");
		Logger l = Logger.getLogger(Person.class.getName());
		l.info("Name: " + p.getName());
		l.info("Age:" + p.getAge());
		l.info("Height (cm):" + p.getHeight());
		l.info("Weight (kg):" + p.getWeight());
		l.info("Eye color:" + p.getEyecolor());
		l.info("Gender:" + p.getGender());
		assertEquals("Joe Q Author", p.getName());
		assertEquals(42, p.getAge());
		assertEquals(173, p.getHeight());
		assertEquals(82, p.getWeight());
		assertEquals("Brown", p.getEyecolor());
		assertEquals("MALE", p.getGender());
		
	}

	private void info(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAge() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAge() {
		fail("Not yet implemented");
	}

	@Test
	void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHeight() {
		fail("Not yet implemented");
	}

	@Test
	void testGetWeight() {
		fail("Not yet implemented");
	}

	@Test
	void testSetWeight() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEyecolor() {
		fail("Not yet implemented");
	}

	@Test
	void testSetEyecolor() {
		fail("Not yet implemented");
	}

	@Test
	void testGetGender() {
		fail("Not yet implemented");
	}

	@Test
	void testSetGender() {
		fail("Not yet implemented");
	}

}
