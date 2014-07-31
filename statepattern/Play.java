package com.practice.statepattern;

public class Play  implements MediaPlayerState{

	@Override
	public void pressButton(StateContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("I am currently palying but goin to pause");
		ctx = new StateContext(new Pause());
		ctx.press();
	}

}
