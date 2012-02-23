/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;


/**
 * @author oded
 *
 */
public class CounterTest {

	@Test
	public void test() {
		
		Integer first,mockedFirst;
		Integer expectedFirst =1;
		
		Counter count = new Counter();
		
		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2);
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
		
		assertEquals("Wronge Answer !",first , mockedFirst);
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
		
		assertEquals("Wronge Answer !",first , mockedFirst);
	}

}
