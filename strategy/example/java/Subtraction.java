/**
 * 
 */
package designpatterns.strategy.example.java;

/**
 * @author manurampandit
 *
 */
public class Subtraction implements IOperation {

	/* (non-Javadoc)
	 * @see designpattern.strategy.example.java.IOperation#execute(int, int)
	 */
	@Override
	public void execute(int a, int b) {
		System.out.println("Subtraction of a & b" + (Math.abs(a-b)));
	}


}
