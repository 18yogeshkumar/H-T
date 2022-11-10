package com.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedDemoTest {

	@ParameterizedTest(name="{index} Run with argument= {0}")
	@ValueSource(ints = {1, 32, 5, -3, 15}) 
	public void valueSourceTest(int number) {
	    System.out.println(number);
	}
	
	
	//Enum Parameters Test
	enum Sport
	{
		Calisthenics,Badminton, Volleyball;
	}
	
	@ParameterizedTest
	@EnumSource(Sport.class)
	public void enumSourceTest(Sport tv)
	{
		System.out.println(tv);
	}
	
	//----method source
	
	private static String[] cars()
	{
		return new String[] {"Tesla","Tata"};
	}
	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars)
	{
		System.out.println(cars);
	}
	
	//
	@ParameterizedTest
	@CsvSource({"test,TEST", "tEst,TEST", "Java,JAVA"})
	public void csvSourceTest(String input, String expected) {
	    String actualValue = input.toUpperCase();
	    assertEquals(expected, actualValue);
	}
}

