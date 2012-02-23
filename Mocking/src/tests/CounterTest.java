/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Counter;

/**
 * @author oded
 *
 */
public class CounterTest {

	@Test
	public void test() {
		
		int first,second,third;
		
		Counter cnt = new Counter();
		
		first = cnt.getValue();
		
		assertEquals("Wronge Answer !", first, 1);
	}

}
