/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Counter;
import static org.mockito.Mockito.*;


/**
 * @author oded
 *
 */
public class CounterTest {

	@Test
	public void test() {
		
		Integer first,mockedFirst;
		
		Counter count = new Counter();
		
		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2);
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
		
		assertEquals("Wronge Answer !",first , mockedFirst);
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
		
		assertEquals("Wronge Answer !",first , mockedFirst);
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
		
		verify(mockedCounter,atLeast(4)).getValue();
		
		assertEquals("Wronge Answer !",first , mockedFirst);
	}

}
