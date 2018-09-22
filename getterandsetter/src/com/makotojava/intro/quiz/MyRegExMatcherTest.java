package com.makotojava.intro.quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Unit 19 Question 8
class MyRegExMatcherTest {

	@Test
	void testMatchesAll() {
		//Calling my method 
		MyRegExMatcher MyRegTest = new MyRegExMatcher();
		
		//Declaring our regular expression based on x and l
		String input = "The quick brown fox over the lazy dogs";
		String regEx = ".*x.*l.*";
		boolean matches = MyRegTest.matchesAll(regEx, input);
		
		assertTrue(matches);
	}

}
