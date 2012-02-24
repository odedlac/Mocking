/**
 * 
 */
package code;

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

	/* (non-Javadoc)
	 * @see tests.Ct#getValue()
	 */
	public Integer getValue() {
		
		return cnt++;
	}


}
