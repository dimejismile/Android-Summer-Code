package com.makotojava.intro.quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

public class Unit21 {

	//Unit 21 Question 4 Solution
	private static final Logger log = Logger.getLogger(MyClassTest.class.getName());
	//Creating the readFile Method to read the file
	public String readFile(String fileName) {
	    
		   String ret;
		   StringBuilder sb = new StringBuilder();
		    
		   File file = new File(fileName);
		   int lineNumber = 0;
		   // try with-resources will close resources when done
		   try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
		      String line = reader.readLine();
		      while (line != null) {
		         sb.append(line);
		         sb.append('\n');
		         // Read the next line
		         line = reader.readLine();
		      }
		   } catch (IOException e) {
		      log.severe("IOException occurred: " + e.getLocalizedMessage());
		   }
		    
		   ret = sb.toString();
		   log.info("File contents:\n" + ret);
		    
		   return ret;
}
	//Unit 21 Question 6
	public String readFileFormatWithMaxCharactersPerLine(String fileName, int maxCharactersPerLine) {
		   String ret;
		   StringBuilder sb = new StringBuilder();
		    
		   File file = new File(fileName);
		   int lineNumber = 0;
		   // try with-resources will close resources when done
		   try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
		      String line = reader.readLine();
		      while (line != null) {
		         line = formatLine(line, maxCharactersPerLine);
		         sb.append(line);
		         sb.append('\n');
		         // Read the next line
		         line = reader.readLine();
		      }
		   } catch (IOException e) {
		      log.severe("IOException occurred: " + e.getLocalizedMessage());
		   }
		    
		   ret = sb.toString();
		   log.info("File contents:\n" + ret);
		    
		   return ret;
	}
			//Unit 21 Question 7
		   public String readFileFormatWithMaxCharacterPerLinePerserveWords(String fileName, int maxCharactersPerLine) {
			   String ret;
			   StringBuilder sb = new StringBuilder();
			    
			   File file = new File(fileName);
			   // try with-resources will close resources when done
			   try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
			      String line = reader.readLine();
			      while (line != null) {
			         line = formatLinePreserveWords(line, maxCharactersPerLine);
			         sb.append(line);
			         // Read the next line
			         line = reader.readLine();
			      }
			   } catch (IOException e) {
			      log.severe("IOException occurred: " + e.getLocalizedMessage());
			   }
			    
			   ret = sb.toString();
			   log.info("File contents: " + ret);
			    
			   return ret;
			}
			private String formatLinePreserveWords(String inputString, int maxCharactersPerLine) {
			   String ret;
			    
			   StringBuilder sb = new StringBuilder();
			    
			   int currentCharacterIndex = 0;
			   while (currentCharacterIndex < inputString.length()) {
			      int currentLineIndex = 0;
			      while (currentLineIndex < maxCharactersPerLine) {
			         String word = fetchNextWord(inputString, currentCharacterIndex, currentLineIndex, maxCharactersPerLine);
			         if (word != null) {
			            currentCharacterIndex += word.length();
			            currentLineIndex += word.length();
			            sb.append(word);
			         } else {
			            break;
			         }
			      }
			      sb.append('\n');
			   }
			    
			   ret = sb.toString();
			   return ret;
			}
			 
			private String fetchNextWord(String inputString, int currentCharacterIndex, int currentLineIndex, int maxCharactersPerLine) {
			   String ret = null;
			    
			   StringBuilder sb = new StringBuilder();
			   while (currentCharacterIndex < inputString.length() && currentLineIndex < maxCharactersPerLine) {
			      char currentCharacter = inputString.charAt(currentCharacterIndex);
			      currentCharacterIndex++;
			      currentLineIndex++;
			      sb.append(currentCharacter);
			      if (Character.isWhitespace(currentCharacter) || currentCharacterIndex == inputString.length()) {
			         ret = sb.toString();
			         break;
			      }
			   }
			   return ret;
			}

	//formatLine Method
	
	
	
	/*//Unit 21 Question 5
	//Lets write a file
	
	public void writeFile(String fileName, String fileContents) {
	    
		   File file = new File(fileName);
		    
		   try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
		      writer.write(fileContents);
		   } catch (IOException e) {
		      log.severe("IOException occurred: " + e.getLocalizedMessage());
		   }*/

	private String formatLine(String line, int maxCharactersPerLine) {
		// TODO Auto-generated method stub
		return null;
	}
}