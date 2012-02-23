/**
 * 
 */
package tests;

/**
 * @author oded
 *
 */
public class Counter {

	private Integer cnt;

	public Counter() {
		super();
		this.cnt = 1;
	}

	public Integer getValue() {
		
		return cnt++;
	}

}
