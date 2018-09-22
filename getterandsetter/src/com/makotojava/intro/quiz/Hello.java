package com.makotojava.intro.quiz;
import java.util.logging.Logger;

public class Hello {
 
	//Unit 18 Question 5
		private static final Logger log = Logger.getLogger(Hello.class.getName()); 
		interface HelloCallback { 
			void sayHello(String whatToSay); } 
		
		public void talk(HelloCallback helloCallback) { 
			helloCallback.sayHello("Hello, world ( I am learning Android Programming @ Android Summer of Code :/)..."); } 
		
		public static void main(String[] args) { 
			// YOUR ANSWER GOES HERE 
			Hello hello = new Hello();
		       
		      hello.talk(new HelloCallback() {
		    	  
		@Override
		public void sayHello(String whatToSay) {
			log.info("This implementation says: " + whatToSay);
		        										
		}
		            
		        });
	}
}
