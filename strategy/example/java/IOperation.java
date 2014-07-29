/**
 * 
 */
package designpattern.strategy.example.java;

/**
 * @author manurampandit
 *         <p>
 *         This class defines the contract between implementation subclasses
 *         </p>
 */
public interface IOperation {
	/**
	 * Execute method acts as common interface operation for all implementation
	 * classes.
	 * 
	 * @param a
	 *            -first parameter
	 * @param b
	 *            -second parameter
	 */
	public void execute(int a, int b);
}
