/**
 * 
 */
package designpattern.strategy.example.java;

/**
 * @author manurampandit
 *
 */
public class Addition implements IOperation {

	/* (non-Javadoc)
	 * @see designpattern.strategy.example.java.IOperation#execute(int, int)
	 */
	@Override
	public void execute(int a, int b) {
		System.out.println("Addition of a & b" + (a+b));
	}


}
