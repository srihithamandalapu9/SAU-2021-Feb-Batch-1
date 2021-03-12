package au.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void test() {
		CheckPrime obj = new CheckPrime();
		boolean result = obj.isPrime(7);
		boolean result1 = obj.isPrime(9);
		assertEquals(result,true);
		assertEquals(false,result1);
	}

}
