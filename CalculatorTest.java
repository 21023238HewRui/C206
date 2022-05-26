import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	@Test
	public void testSubstract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		}
	@Test
	public void testMultiple() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		int expected = 5332114;
		assertEquals (expected, actual);
		}
	@Test
	public void testDivide() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		double actual = cal.devide(a, b); 
			 
		double expected = 3.5016207455429497568881685575365;
		assertEquals (expected, actual);
		}
	


	


}
