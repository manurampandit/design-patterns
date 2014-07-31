package designpatterns.statepattern;

public class Demo {
	public static void main(String[] args) {
		//create initial state with play 
		StateContext ctx = new StateContext(new Play());
		ctx.press();
		ctx = new StateContext(new Play());
		ctx.press();
	}
}
