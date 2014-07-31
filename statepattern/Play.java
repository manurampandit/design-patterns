package designpatterns.statepattern;

public class Play  implements IMediaPlayerState{

	@Override
	/**
	 * This method changes current state to pause state
	 *  -- A difference with Strategy pattern where one state knows about another state
	 */
	public void pressButton(StateContext ctx) {
		System.out.println("I am currently palying but goin to pause");
		ctx = new StateContext(new Pause());
		ctx.press();
	}

}
