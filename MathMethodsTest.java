import org.junit.*;
import static org.junit.Assert.*;

// Tests the methods in the Lab2 class
public class MathMethodsTest {
	
	// Tests the abs() method, takes the correct answer as the first 
	// and the method's answer as the second parameter 
	@Test public void testAbs() {

		assertEquals(10, Lab2.abs(-10));
		assertEquals(5, Lab2.abs(5));
		assertEquals(0, Lab2.abs(0));
		
	}
	
	// Tests the min() method, takes the correct answer as the first 
	// and the method's answer as the second parameter 
	@Test public void testMin() {
		
		assertEquals(1, Lab2.min(1, 5));
		assertEquals(3, Lab2.min(3, 3));
		assertEquals(-10, Lab2.min(-10, -5));
		
	}

	// Tests the max() method, takes the correct answer as the first 
	// and the method's answer as the second parameter 
	@Test public void testMax() {
		
		assertEquals(1, Lab2.max(1, 0));
		assertEquals(3, Lab2.max(3, 3));
		assertEquals(-5, Lab2.max(-10, -5));
		
	}
	
	// Tests the pow() method, takes the correct answer as the first 
	// and the method's answer as the second parameter
	@Test public void testPow() {
		
		assertEquals(27, Lab2.pow(3, 3), 0.00001);
		assertEquals(-1, Lab2.pow(-1, 5), 0.00001);
		
		assertEquals(Double.POSITIVE_INFINITY, Lab2.pow(0, 2), 0.00001);
		assertEquals(1, Lab2.pow(2, 0), 0.00001);
		
		assertEquals(12.25, Lab2.pow(3.5, 2), 0.00001);
		assertEquals(0.125, Lab2.pow(2, -3), 0.00001);
		
	}
	
}
