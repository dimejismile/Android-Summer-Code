package com.makotojava.intro.quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Unit21Test {
	
	//Unit 21 Question 4 Solution
	
	private static final String INPUT_FILE_NAME = "C:\\Users\\Oladimeji Ridwan\\git\\repository2\\getterandsetter\\src\\com\\makotojava\\intro\\quiz\\lorem.txt";
	
	@Test
	void testReadFile() {
		
		Unit21 classUnderTest = new Unit21();
	    
		classUnderTest.readFile(INPUT_FILE_NAME);
		
	}
	//Unit 21 Question 6
	@Test
	public void testReadFileFormatWithMaxCharactersPerLine() {
	   Unit21 classUnderTest = new Unit21();
	    
	   classUnderTest.readFileFormatWithMaxCharactersPerLine(INPUT_FILE_NAME, 80);
	}
	/*//Unit 21 Question 5
	//writeFile Method
	@Test
	public void testWriteFile() {
	   String fileName = "C:\\Users\\Oladimeji Ridwan\\git\\repository2\\getterandsetter\\src\\com\\makotojava\\intro\\quiz\\lorem2.txt";
	    
	   Unit21 classUnderTest = new Unit21();
	    
	   String fileContents = classUnderTest.readFile(INPUT_FILE_NAME);
	   classUnderTest.writeFile(fileName, fileContents);
	}*/
}
