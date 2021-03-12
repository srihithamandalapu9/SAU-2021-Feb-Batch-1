package au.com;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class ToDoServiceMockTest {
	
	ToDoService testObj ;
	
	@Before
	public void setup() {
	
		CheckPrime chkPrime = mock(CheckPrime.class);
		when(chkPrime.verify(7)).thenReturn(true);
		testObj = new ToDoService();
		testObj.setObject(chkPrime);					
	}
	
	@Test
	public void testVerifyPrime() {
		assertEquals(false, testObj.verifyPrime(7));
	}
	
}
