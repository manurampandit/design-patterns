/**
 * 
 */
package designpatterns.strategy.example.java;

/**
 * @author manurampandit
 *
 */
public class Division implements IOperation {

	/* (non-Javadoc)
	 * @see designpattern.strategy.example.java.IOperation#execute(int, int)
	 */
	@Override
	public void execute(int a, int b) {
		System.out.println("Division of a & b" + ((float)a/b));
	}


}
