package getterandsetter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class PersonTest2 {

	@Test
	void testPerson() {
		Person x = new Person();
		assertEquals("Pamilerin", x.toString());
		assertEquals(42, x.toString());
		assertEquals(173, x.toString());
		assertEquals(82, x.toString());
		assertEquals("Brown", x.toString());
		assertEquals("MALE", x.toString());	
	}

	@Test
	void testPersonStringIntIntIntStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		
	}

}
