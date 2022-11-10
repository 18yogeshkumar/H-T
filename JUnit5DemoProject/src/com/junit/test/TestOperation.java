package com.junit.test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Operation;

class TestOperation {
	
	Operation test;
	
	 @BeforeEach
	  public void setUp() {
	    test = new Operation();
	  }

	 @After
	  public void destroy() {
	    test = null;
	  }
	  

	  @Test
	  @DisplayName("Addition")
	  public void testAdd() {
	    assertEquals("add", 7, test.add(3, 4));
	  }

//	  @Test(expected = IllegalArgumentException.class)
//	  public void testAdd_negativeNumbers_shouldThrowException() {
//	    test.add(-3, -4);
//	  }

	  @Test
	  @DisplayName("Subtraction")
	  public void testSubstract() {
	    assertEquals("subtract", 2, test.subtract(5, 3));
	  }

	  @Test
	  @DisplayName("Multiply")
	  public void testMultiply() {
	    assertEquals("multiply", 56, test.multiply(7, 8));
	  }
	  
	  

	}

