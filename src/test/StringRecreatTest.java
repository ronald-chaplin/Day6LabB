package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.StringRecreate;

class StringRecreatTest {
	
	StringRecreate testString;
	
	@BeforeEach
	void init(){
		testString = new StringRecreate("This is a test of the method");
	}
	

	@Test
	void testToString() {
		String test = "This is a test of the method";
		
		String actual = testString.toString();
		
		assertEquals(actual, test, "This should be true");
		
	}
	
	@Test
	void testCharAt() {
		Character test = 't';
		
		Character actual = testString.charAt(10);
		
		assertEquals(actual, test, "This should be true");
	}
	
	@Test
	void testConcat() {
		String test = "This is a test of the method Concat";
		
		testString.concat(" Concat");
		
		String actual = testString.toString();
		
		assertEquals(actual, test, "This should concat");
	}
	
	@Test
	void testIndexOf() {
		int test = 10;
		
		int actual = testString.indexOf('t');
		
		assertEquals(actual, test, "This should be true");
	}
	
	@Test
	void testLength() {
		int test = 28;
		
		int actual = testString.length();
		
		assertEquals(actual, test, "This should be true");
	}
	
	@Test	
	void testToLowerCase() {
		String test = "this is a test of the method";
		
		testString.toLowerCase();
		
		String actual = testString.toString();
		
		assertEquals(actual, test, "This should be true");
	}
	
	@Test
	void testToUpperCase() {
		String test = "THIS IS A TEST OF THE METHOD";
		
		testString.toUpperCase();
		
		String actual = testString.toString();
		
		assertEquals(actual, test, "This should be true");
	}
}
