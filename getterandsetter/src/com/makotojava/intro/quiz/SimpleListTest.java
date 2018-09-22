package com.makotojava.intro.quiz;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	void testSimpleList() {
		fail("Not yet implemented");
	}

	@Test
	void testAdd() {
		Logger log = Logger.getLogger(SimpleListTest.class.getName());
	    SimpleList<BigDecimal> sl = new SimpleList<>();
	    sl.add(BigDecimal.ONE);
	    log.info("SimpleList size is : " + sl.size());
	    sl.add(BigDecimal.ZERO);
	    log.info("SimpleList size is : " + sl.size());
	    sl.clear();
	    log.info("SimpleList size is : " + sl.size());
	  }
	

	@Test
	void testSize() {
		fail("Not yet implemented");
	}

	@Test
	void testClear() {
		fail("Not yet implemented");
	}

}
