package com.makotojava.intro;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

public class Unit9Test {
	//Unit 9 Question 13 Not Finished Yet!
	@Test
	public void testUnit9() {
		Unit9 p = new Unit9 ("Joe Q Author", 42, 173, 82, "Brown", "MALE");
		Logger l = Logger.getLogger(Unit9.class.getName());
		for (int aa = 0; aa < 10; aa++) {
		if (aa == 4) {
				continue;
			}
		else if (aa == 5) {
				continue;
			}
		else if (aa == 9) {
			continue;
		}
		l.info("Loop executing iteration#" + aa);
		l.info("Name:" + p.getName());
		l.info("Age:" + p.getAge());
		l.info("Height (cm):" + p.getHeight());
		l.info("Weight (kg):" + p.getWeight());
		l.info("Eye Color:" + p.getEyecolor());
		l.info("Gender:" + p.getGender());
	}
	}
	/*Unit 9 Question 11
	@Test
	public void testUnit9() {
		Logger q = Logger.getLogger(Unit9.class.getName());
		int aa = 3;
		do {
			Unit9 c = new Unit9 ("Joe Q Author", 42, 173, 82, "Brown", "MALE");
			q.info("Loop executing iteration#" + aa);
			q.info("Name:" + c.getName());
			q.info("Age:" + c.getAge());
			q.info("Height (cm):" + c.getHeight());
			q.info("Weight (kg):" + c.getWeight());
			q.info("Eye Color:" + c.getEyecolor());
			q.info("Gender:" + c.getGender());
			aa++;
		} while (aa < 9);
	}
	
	*/
	/*Unit 9 Question 11 
	@Test
	public void testUnit9() {
		Logger q = Logger.getLogger(Unit9.class.getName());
		int bb = 3;
		while (bb < 9) {
			Unit9 c = new Unit9 ("Joe Q Author", 42, 173, 82, "Brown", "MALE");
			q.info("Loop executing iteration#" + bb);
			q.info("Name:" + c.getName());
			q.info("Age:" + c.getAge());
			q.info("Height (cm):" + c.getHeight());
			q.info("Weight (kg):" + c.getWeight());
			q.info("Eye Color:" + c.getEyecolor());
			q.info("Gender:" + c.getGender());
			bb++;
		}
	}
	*/
	
	/*Unit 9 Question 10 
	@Test
	public void testUnit9() {
		Unit9 p = new Unit9 ("Joe Q Author", 42, 173, 82, "Brown", "MALE");
		Logger l = Logger.getLogger(Unit9.class.getName());
		for (int aa = 3; aa < 9; aa++)
		l.info("Loop executing iteration#" + aa);
		l.info("Name:" + p.getName());
		l.info("Age:" + p.getAge());
		l.info("Height (cm):" + p.getHeight());
		l.info("Weight (kg):" + p.getWeight());
		l.info("Eye Color:" + p.getEyecolor());
		l.info("Gender:" + p.getGender());
		
	}*/

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAge() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAge() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetHeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetWeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEyecolor() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEyecolor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGender() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGender() {
		fail("Not yet implemented");
	}

}
