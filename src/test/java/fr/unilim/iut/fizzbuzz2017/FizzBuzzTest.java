package fr.unilim.iut.fizzbuzz2017;

import static org.junit.Assert.*;


import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz FizzBuzz= new FizzBuzz();
	
	@Test
	public void test_should_display_1_when_1(){
		
		FizzBuzz FizzBuzz= new FizzBuzz();
		String result = FizzBuzz.jouer(1);
		assertEquals(result,"1");
	}
	
	@Test
	public void test_should_display_n_when_n(){
		
		FizzBuzz FizzBuzz= new FizzBuzz();
		String result = FizzBuzz.jouer(2);
		assertEquals(result,"2");
	}
	
	@Test
	public void test_should_display_Fizz_when_MultipleOf3(){
		
		FizzBuzz FizzBuzz= new FizzBuzz();
		String result = FizzBuzz.jouer(6);
		assertEquals(result,"Fizz");
	}
	
	@Test
	public void test_should_display_Buzz_when_MultipleOf5(){
		
		FizzBuzz FizzBuzz= new FizzBuzz();
		String result = FizzBuzz.jouer(10);
		assertEquals(result,"Buzz");
	}
	
	@Test
	public void test_should_display_FizzBuzz_when_MultipleOf15(){
		
		FizzBuzz FizzBuzz= new FizzBuzz();
		String result = FizzBuzz.jouer(14);
		assertEquals(result,"Fizz Buzz");
	}

}
