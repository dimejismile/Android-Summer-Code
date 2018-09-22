package com.makotojava.intro.quiz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Unit 19 Question 9
//Declaring the class 'MyRegExMatcher'
public class MyRegExMatcher {

	//Declaring the method 'matchesAll' and the two parameters 'regex' and 'input'
	public boolean matchesAll(String regEx, String input) {
		boolean ret = true;
		
		Pattern pattern = Pattern.compile(regEx);
	      Matcher matcher = pattern.matcher(input);
	       
	      ret = matcher.matches();
	      return ret;
	}
}
