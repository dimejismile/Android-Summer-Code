package com.makotojava.intro.quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Unit21Test {
	
	private static final String INPUT_FILE_NAME = "C:\\Users\\Oladimeji Ridwan\\git\\repository2\\getterandsetter\\src\\com\\makotojava\\intro\\quiz\\lorem.txt";
	
	@Test
	void testReadFile() {
		
		Unit21 classUnderTest = new Unit21();
	    
		classUnderTest.readFile(INPUT_FILE_NAME);
		
	}

}
