package WebDrivers;

import static org.junit.Assert.*;

import org.junit.Test;

public class Triangle_Test_Demo_JUnit {
	
	Triangle_Test_Demo_Question Demo = new Triangle_Test_Demo_Question();
	

	@Test
	public void test_isTriangle_1(){
		//String input1="1\n";
		assertTrue(Triangle_Test_Demo_Question.isTriangle(15, 12, 20)); 
	}
	@Test
	public void test_isTriangle_2(){
		//String input1="1\n";
		assertTrue(Triangle_Test_Demo_Question.isTriangle(10, 10, 10));
	}
	@Test
	public void test_isTriangle_3(){
		//String input1="1\n";
		assertTrue(Triangle_Test_Demo_Question.isTriangle(18, 15, 20));
	}
	@Test
	public void test_isTriangle_4(){
		//String input1="1\n";
		assertFalse(Triangle_Test_Demo_Question.isTriangle(2, 1, 4));

	}
	@Test
	public void test_isTriangle_5(){
		//String input1="1\n";
		assertFalse(Triangle_Test_Demo_Question.isTriangle(25, 4, 10));

	}
	@Test
	public void test_isTriangle_6(){
		//String input1="1\n";
		assertFalse(Triangle_Test_Demo_Question.isTriangle(5, 1, 1));
	}
	@Test
	public void test_isTriangle_7(){
		//String input1="1\n";
		assertFalse(Triangle_Test_Demo_Question.isTriangle(15, 20, 35));
	}
	@Test
	public void test_isTriangle_8(){
		//String input1="1\n";
		assertTrue(Triangle_Test_Demo_Question.isTriangle(16, 16, 15));
	
	}
	@Test
	public void test_isTriangle_11(){
		//String input1="1\n";
		assertFalse(Triangle_Test_Demo_Question.isTriangle(75, 120, 15));
	}
	@Test
	public void test_isTriangle_12(){
		//String input1="1\n";
		assertTrue(Triangle_Test_Demo_Question.isTriangle(22, 18, 14));
	}
}


