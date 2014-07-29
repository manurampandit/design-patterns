/**
 * 
 */
package designpattern.strategy.example.java;

/**
 * @author manurampandit
 *         <p>
 *         Implementation class--self explanatory
 *         </p>
 * 
 */
public class ImplementationClass {
	public static void main(String[] args) {
		int a = 5, b = 10;
		//create context object with parameter as object
		Concrete c = new Concrete(new Addition());
		c.print(a, b);
		c = new Concrete(new Subtraction());
		c.print(a, b);
		c = new Concrete(new Multiplication());
		c.print(a, b);
		c = new Concrete(new Division());
		c.print(a, b);
	}

}
