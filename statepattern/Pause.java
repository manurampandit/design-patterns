package designpatterns.statepattern;

public class Pause implements IMediaPlayerState{

	@Override
	/**
	 * This method changes current state to pause state
	 *  -- A difference with Strategy pattern where one state knows about another state
	 */
	public void pressButton(StateContext ctx) {
		System.out.println("I am paused now..going to stop!!!");
		//assign another state
		ctx= new StateContext(new Stop());
		ctx.press();
	}

}
