package com.makotojava.intro;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.logging.*;
public class Unit10Test {

	//Unit 10 Question 4
	  @Test
	public void test() {
		int[] intInit = {1, 2, 3, 5, 7, 9, 11, 13, 15, 17, 19, 23, 25};
		Logger l = Logger.getLogger("Test");
		for (int aa = 0; aa < intInit.length; aa++) {
			l.info("This little integer's value is: " + intInit[aa]);}	
}
}
		/* Unit 10 Question 2 & 3 
		 * ssint[] intInit = new int[] {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 29 };
		Logger l = Logger.getLogger("Test");
		for (int i : intInit) {
			l.info("This little integer's value is: " + i);}
	}
*/

