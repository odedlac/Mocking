/**
 * 
 */
package code;

/**
 * @author oded
 *
 */
public class Counter {

	private int cnt;

	public Counter() {
		super();
		this.cnt = 1;
	}

	public int getValue() {
		
		return cnt++;
	}

}
