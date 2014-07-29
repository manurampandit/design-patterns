/**
 * 
 */
package designpatterns.strategy.example.java;

/**
 * @author manurampandit
 * @version 1.0
 * <p> This class serves as Context class composing Strategy interface </p> 
 * 
 */
public class Concrete {
	// Observe composition-- Ioperation interface
	IOperation operation;

	/**
	 * Initializing constructor with an object of type IOperation
	 * 
	 * @param operation
	 */
	Concrete(IOperation operation) {
		this.operation = operation;
	}

	/**
	 * Performing the execute operation
	 * 
	 * @param a
	 *            -- first parameter
	 * @param b
	 *            -- second parameter
	 */
	public void print(int a, int b) {
		operation.execute(a, b);
	}
}
