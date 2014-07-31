package designpatterns.statepattern;

public class Stop implements IMediaPlayerState{

	@Override
	public void pressButton(StateContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("I am stopped now ...Please press again play if u want to play");
		
	}

}
